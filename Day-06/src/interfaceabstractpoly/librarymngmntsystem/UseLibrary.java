package interfaceabstractpoly.librarymngmntsystem;

public class UseLibrary {
    public static void main(String[] args) {
        // Create library items
        LibraryItem book = new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald");
        LibraryItem magazine = new Magazine("M001", "Time Magazine", "Time Editorial");
        LibraryItem dvd = new DVD("D001", "Inception", "Christopher Nolan");

        // Array of items
        LibraryItem[] items = {book, magazine, dvd};

        // Process items
        for (LibraryItem item : items) {
            System.out.println("-------------------------------");
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable reservable = (Reservable) item;
                System.out.println("Availability: " + (reservable.checkAvailability() ? "Available" : "Reserved"));
                reservable.reserveItem("John Doe");
                System.out.println("Availability after reservation: " + (reservable.checkAvailability() ? "Available" : "Reserved"));
            }
        }
    }
}

