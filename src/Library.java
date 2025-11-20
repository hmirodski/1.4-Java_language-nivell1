import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Library {

    private List<Book> books = new ArrayList<Book>();

    public void addBook(Book book){
        if(books.contains(book)){
            System.out.println("Book already exists");
        }else{
            books.add(book);
            System.out.println(book + " Added to the Library");
        }
        books.sort(Comparator.comparing(Book::getTitle));
    }


    public boolean deleteBookByTitle(String title){
        for(int i = 0 ; i <  books.size(); i++){
            if(books.get(i).getTitle().equalsIgnoreCase(title)){
                books.remove(i);
                books.sort(Comparator.comparing(Book::getTitle));
                return true;
            }

        }

        return false;
    }

    public void removeByIndex(int index){
        books.remove(index);
        books.sort(Comparator.comparing(Book::getTitle));
    }

    public Book getBookAt(int index){
        return books.get(index);
    }

    public void addBookAtIndex(int index, Book book){
        if(books.contains(book)){
            System.out.println("Book already exists");
            return;
        }else{
            books.add(index, book);
        }
        books.sort(Comparator.comparing(Book::getTitle));
    }

    public List<Book> getBooks() {
        return books;

    }
}
