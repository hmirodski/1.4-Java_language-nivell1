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

        assertEquals("Dubliners", library.getBooks().get(0).getTitle());
        assertEquals("Ulysses", library.getBooks().get(1).getTitle());
    }

}
