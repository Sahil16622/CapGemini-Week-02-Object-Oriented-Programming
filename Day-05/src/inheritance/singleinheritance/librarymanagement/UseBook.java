package inheritance.singleinheritance.librarymanagement;

public class UseBook{
    public static void main(String[] args) {

        Book book;
        book = new Book("Godaan", 1936);
        book.displayInfo();
        System.out.println();
        book = new Author("Godaan", 1936, "Munsi Premchand", "Humanist");
        book.displayInfo();

    }
}
