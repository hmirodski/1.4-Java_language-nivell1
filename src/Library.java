import java.util.ArrayList;
import java.util.List;

public class Library {

    List<Book> books = new ArrayList<Book>();

    public void addBook(Book book){
        if(books.contains(book)){
            System.out.println("Book already exists");
        }else{
            books.add(book);
            System.out.println(book + " Added to the Library");

        }
    }

    public void deleteBook(Book book){
        books.remove(book);
        System.out.println(book + " deleted successfully");
    }

    public boolean deleteBookByTitle(String title){
        for(int i = 0 ; i <  books.size(); i++){
            if(books.get(i).getTitle().equals(title)){
                books.remove(i);
                return true;
            }
        }
        return false;
    }

    public void removeByIndex(int index){
        books.remove(index);
    }

    public Book getBookByIndex(int index){
        return books.get(index);
    }

    public List<Book> getBooks() {
        return books;

    }
}
