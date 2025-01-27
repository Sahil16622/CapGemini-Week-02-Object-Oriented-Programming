package inheritance.singleinheritance.librarymanagement;

public class Author extends Book {
    String name;
    String bio;

    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Name of the author is:" + name);
        System.out.println("Bio of the author describes:" + bio);
    }
}