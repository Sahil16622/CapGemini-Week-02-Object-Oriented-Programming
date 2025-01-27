package interfaceabstractpoly.onlinefooddelivery;

class NonVegItem extends FoodItem implements Discountable {
    private static final double NON_VEG_EXTRA_CHARGE = 20.0; // Additional charge for non-veg items

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() + NON_VEG_EXTRA_CHARGE) * getQuantity();
    }

    @Override
    public double applyDiscount(double percentage) {
        double discount = calculateTotalPrice() * (percentage / 100);
        return calculateTotalPrice() - discount;
    }

    @Override
    public String getDiscountDetails() {
        return "Discount applicable for Non-Veg Items.";
    }
}

