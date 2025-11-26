package exercici1;

import exercici1.Book;
import exercici1.Library;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class LibraryTests {

    @Test
    public void bookListIsNotNull() {
        Library library = new Library();
        assertNotNull(library.getBooks());
    }

    @Test
    public void listSize() {
        Library library = new Library();
        Book book1 = new Book("Dubliners", "James Joyce");
        Book book2 = new Book("Ulysses", "James Joyce");

        library.addBook(book1);
        library.addBook(book2);

        assertEquals(2, library.getBooks().size());
    }

    @Test
    public void correctIndex(){
        Library library = new Library();
        Book book1 = new Book("Dubliners", "James Joyce");
        Book book2 = new Book("Ulysses", "James Joyce");
        library.addBook(book1);
        library.addBook(book2);

        assertEquals("Dubliners", library.getBookAt(0).getTitle());
        assertEquals("Ulysses", library.getBookAt(1).getTitle());
    }

    @Test
    public void noDuplicates(){
        Library library = new Library();
        Book book1 = new Book("Dubliners", "James Joyce");
        library.addBook(book1);
        library.addBook(book1);

        assertEquals(1, library.getBooks().size());


    }

    @Test
    public void titlesByIndex(){

        Library library = new Library();
        Book book1 = new Book("Dubliners", "James Joyce");
        Book book2 = new Book("Ulysses", "James Joyce");

        library.addBook(book1);
        library.addBook(book2);

        assertEquals("Dubliners", library.getBooks().get(0).getTitle());
        assertEquals("Ulysses", library.getBooks().get(1).getTitle());
    }

    @Test
    public void modifiedList(){
        Library library = new Library();

        assertEquals(0, library.getBooks().size());

        Book book1 = new Book("Dubliners", "James Joyce");
        library.addBook(book1);

        assertEquals(1, library.getBooks().size());

        Book book2 = new Book("Ulysses", "James Joyce");
        library.addBook(book2);
        assertEquals(2, library.getBooks().size());

    }

    @Test
    public void decreasedListSize(){
        Library library = new Library();
        Book book1 = new Book("Dubliners", "James Joyce");
        Book book2 = new Book("Ulysses", "James Joyce");

        library.addBook(book1);
        library.addBook(book2);

        assertEquals(2, library.getBooks().size());

        library.deleteBookByTitle("Dubliners");
        assertEquals(1, library.getBooks().size());

        library.deleteBookByTitle("Ulysses");
        assertEquals(0, library.getBooks().size());

    }

    @Test
    public void sortedList(){
        Library library = new Library();
        Book book1 = new Book("Dubliners", "James Joyce");
        Book book2 = new Book("Ulysses", "James Joyce");
        Book book3 = new Book("Harry Potter", "J K Rowling");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        assertEquals("Dubliners", library.getBookAt(0).getTitle());

        assertEquals("Harry Potter", library.getBookAt(1).getTitle());
        assertEquals("Ulysses", library.getBookAt(2).getTitle());

        library.deleteBookByTitle("Dubliners");
        assertEquals("Harry Potter", library.getBookAt(0).getTitle());
        assertEquals("Ulysses", library.getBookAt(1).getTitle());

    }

}
