package interfaceabstractpoly.vehiclemngmntsystm;

public class UseProduct {

    public static void main(String[] args) {
        // Create products
        Product electronics = new Electronics(1, "Smartphone", 30000);
        Product clothing = new Clothing(2, "T-shirt", 1000);
        Product groceries = new Groceries(3, "Milk", 50);

        // Display product details with polymorphism
        processProduct(electronics);
        System.out.println("");
        processProduct(clothing);
        System.out.println("");
        processProduct(groceries);
    }

    // Method to process and display final price of a product
    public static void processProduct(Product product) {
        double tax = 0;
        if (product instanceof Taxable) {
            Taxable taxable = (Taxable) product;
            tax = taxable.calculateTax();
            System.out.println(taxable.getTaxDetails());
        } else {
            System.out.println("No tax applicable for this product.");
        }
        product.displayDetails(tax);
    }
}



