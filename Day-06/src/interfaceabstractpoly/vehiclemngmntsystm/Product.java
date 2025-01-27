package interfaceabstractpoly.vehiclemngmntsystm;

abstract class Product {


    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Getter and Setter methods
    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Abstract method
    public abstract double calculateDiscount();

    // Method to calculate final price
    public double calculateFinalPrice(double tax) {
        double discount = calculateDiscount();
        return price + tax - discount;
    }

    // Display product details
    public void displayDetails(double tax) {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Tax: " + tax);
        System.out.println("Discount: " + calculateDiscount());
        System.out.println("Final Price: " + calculateFinalPrice(tax));
    }


}
