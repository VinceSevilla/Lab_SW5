import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class BookDA {
    private HashMap<String, Book> bookMap;

    public BookDA() throws FileNotFoundException{
        bookMap = new HashMap<>();
        Scanner blockFile = new Scanner(new FileReader("/workspaces/Lab_SW5/Book.csv"));

        while(blockFile.hasNext()){
            Book book = new Book();
            String bookFileRaw = blockFile.nextLine();
            String[] bookArray = bookFileRaw.split(",", 3);
            book.setIsbn(bookArray[0].trim());
            book.setTitle(bookArray[1].trim());
            AuthorDA author = new AuthorDA();
            book.setAuthor(author.getAuthorMap().get(bookArray[2].trim()));
            bookMap.put(book.getIsbn(), book);
        }

        blockFile.close();
    }
    public HashMap<String, Book> getBookMap(){
        return bookMap;
    }
}