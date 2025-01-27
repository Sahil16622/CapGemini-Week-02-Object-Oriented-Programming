package interfaceabstractpoly.vehiclemngmntsystm;

public class Clothing extends Product implements Taxable{


    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.15; // 15% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.12; // 12% tax
    }

    @Override
    public String getTaxDetails() {
        return "Clothing Tax: 12%";
    }
}

// Groceries class
