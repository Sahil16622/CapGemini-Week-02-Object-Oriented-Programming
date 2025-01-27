package inheritance.singleinheritance.librarymanagement;

public class Book {
    protected String title;
    protected int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public void displayInfo() {
        System.out.println("Title of the book is:" + title);
        System.out.println("Book was publicated in year" + publicationYear);
    }
}