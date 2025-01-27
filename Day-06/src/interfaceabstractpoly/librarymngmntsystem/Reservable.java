package interfaceabstractpoly.librarymngmntsystem;

interface Reservable {
    void reserveItem(String borrowerName);

    boolean checkAvailability();
}
