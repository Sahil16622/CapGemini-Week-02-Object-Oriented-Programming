package interfaceabstractpoly.onlinefooddelivery;

public class UseFoodClass {
    public static void main(String[] args) {
        // Create food items
        FoodItem vegItem = new VegItem("Paneer Butter Masala", 150, 2);
        FoodItem nonVegItem = new NonVegItem("Chicken Biryani", 250, 3);

        // Process food items
        processOrder(vegItem, 10); // Applying 10% discount
        System.out.println("-------------------------------");
        processOrder(nonVegItem, 15); // Applying 15% discount
    }

    // Method to process order
    public static void processOrder(FoodItem item, double discountPercentage) {
        item.getItemDetails();
        System.out.println("Total Price: " + item.calculateTotalPrice());

        if (item instanceof Discountable) {
            Discountable discountable = (Discountable) item;
            System.out.println(discountable.getDiscountDetails());
            System.out.println("Price after " + discountPercentage + "% discount: " + discountable.applyDiscount(discountPercentage));
        }
    }
}

