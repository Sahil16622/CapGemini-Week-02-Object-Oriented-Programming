package inheritance.hybridinheritance.restaurantmanagement;

public class Waiter extends Person implements Worker {
    String section;

    public Waiter(String name, int id, String section) {
        super(name, id);
        this.section = section;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is a Waiter managing the " + section + " section and serving customers.");
    }
}
