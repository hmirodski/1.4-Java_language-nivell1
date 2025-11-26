package exercici1;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();
        Book book1 = new Book("Dubliners", "James Joyce");
        Book book2 = new Book("Ulysses", "James Joyce");

        library.addBook(book1);
        library.addBook(book2);


        System.out.println(library.getBooks());
        library.removeByIndex(0);

        System.out.println(library.getBooks());


    }
}
