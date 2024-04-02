import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.*;
public class BookReport {
    public static void main(String[] args) throws FileNotFoundException {
        BookDA bookDA = new BookDA();

        for(HashMap.Entry<String, Book> entryMap : bookDA.getBookMap().entrySet()){
            System.out.print(entryMap.getValue().getIsbn()+" ");
            System.out.println(entryMap.getValue().getTitle());
            System.out.println("\t"+entryMap.getValue().getAuthor().getName()+"\n");
        }
    }
}