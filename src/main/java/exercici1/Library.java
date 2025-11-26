package exercici1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Library {

    private List<Book> books = new ArrayList<Book>();

    public void addBook(Book book){
        if (!books.contains(book)) {
            books.add(book);
            sortBooks();
        }
    }


    public boolean deleteBookByTitle(String title){
        for(int i = 0 ; i <  books.size(); i++){
            if(books.get(i).getTitle().equalsIgnoreCase(title)){
                books.remove(i);
                sortBooks();
                return true;
            }

        }

        return false;
    }

    public void removeByIndex(int index){
        books.remove(index);
        sortBooks();
    }

    public Book getBookAt(int index){
        return books.get(index);
    }

    public void addBookAtIndex(int index, Book book){
        if (books.contains(book)) {
            return;
        }
        books.add(index, book);
        sortBooks();
    }

    public List<Book> getBooks() {
        return Collections.unmodifiableList(books);
    }

    private void sortBooks() {
        books.sort(Comparator.comparing(Book::getTitle));
    }
}
