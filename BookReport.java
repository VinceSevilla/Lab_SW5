import java.io.FileNotFoundException;
import java.util.HashMap;

public class BookReport {
    public static void main(String[] args) {
        try {
            BookDA bookDA = new BookDA();
            HashMap<String, Book> bookMap = bookDA.getBookMap();

            for (HashMap.Entry<String, Book> entryMap : bookMap.entrySet()) {
                Book book = entryMap.getValue();
                Author author = book.getAuthor();

                System.out.print(book.getIsbn() + " ");
                System.out.println(book.getTitle());
                System.out.println("\t" + author.getName() + " - " + author.getBio() + "\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
