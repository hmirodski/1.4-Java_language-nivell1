package exercici1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class LibraryTests {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;

    @BeforeEach
    public void setUp() {
        library = new Library();
        book1 = new Book("Dubliners", "James Joyce");
        book2 = new Book("Ulysses", "James Joyce");
        book3 = new Book("Harry Potter", "J K Rowling");
    }

    @Test
    public void bookListIsNotNull() {
        assertNotNull(library.getBooks());
    }

    @Test
    public void addingBooksShouldIncreaseListSize() {
        library.addBook(book1);
        library.addBook(book2);

        assertEquals(2, library.getBooks().size());
    }

    @Test
    public void booksAreStoredInCorrectPosition() {
        library.addBook(book1);
        library.addBook(book2);

        assertEquals("Dubliners", library.getBookAt(0).getTitle());
        assertEquals("Ulysses", library.getBookAt(1).getTitle());
    }

    @Test
    public void duplicateBooksAreNotAdded() {
        library.addBook(book1);
        library.addBook(book1);

        assertEquals(1, library.getBooks().size());
    }

    @Test
    public void booksCanBeRetrievedByIndex() {
        library.addBook(book1);
        library.addBook(book2);

        assertEquals("Dubliners", library.getBooks().get(0).getTitle());
        assertEquals("Ulysses", library.getBooks().get(1).getTitle());
    }

    @Test
    public void libraryShouldStartWithEmptyList() {
        assertEquals(0, library.getBooks().size());

        library.addBook(book1);
        assertEquals(1, library.getBooks().size());

        library.addBook(book2);
        assertEquals(2, library.getBooks().size());
    }

    @Test
    public void deletingBooksShouldDecreaseListSize() {
        library.addBook(book1);
        library.addBook(book2);

        assertEquals(2, library.getBooks().size());

        library.deleteBookByTitle("Dubliners");
        assertEquals(1, library.getBooks().size());

        library.deleteBookByTitle("Ulysses");
        assertEquals(0, library.getBooks().size());
    }

    @Test
    public void booksAreKeptInAlphabeticalOrder() {
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
