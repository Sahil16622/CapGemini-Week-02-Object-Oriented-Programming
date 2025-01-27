package inheritance.hybridinheritance.restaurantmanagement;

public class UsePerson{
    public static void main(String[] args) {

        Chef chef = new Chef("Gordon", 101, "Italian Cuisine");
        Waiter waiter = new Waiter("Emily", 201, "VIP Lounge");

        chef.displayInfo();
        chef.performDuties();

        System.out.println();

        waiter.displayInfo();
        waiter.performDuties();
    }
}
