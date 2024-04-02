import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class AuthorDA {
    private HashMap<String, Author> authorMap;

    public AuthorDA() throws FileNotFoundException {
        authorMap = new HashMap<>();

        Scanner blockFile = new Scanner(new FileReader("/workspaces/Lab_SW5/Author.csv"));
        
        while (blockFile.hasNext()) {
            String authorFileRaw = blockFile.nextLine();
            String[] authorArray = authorFileRaw.split(",", 2);

            Author author = new Author();
            author.setName(authorArray[0].trim());
            author.setBio(authorArray[1].trim());
            authorMap.put(author.getName(), author);
        }
        
        blockFile.close();
    }

    public HashMap<String, Author> getAuthorMap() {
        return authorMap;
    }
}
