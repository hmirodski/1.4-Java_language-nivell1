import java.util.ArrayList;
import java.util.List;

public class Library {

    List<Book> books = new ArrayList<Book>();

    public void addBook(Book book){
        books.add(book);
        System.out.println(book + "Added to the Library");
    }

    public void deleteBook(Book book){
        books.remove(book);
        System.out.println(book + " deleted successfully");
    }

    public List<Book> getBooks() {
        return books;
    }
}
