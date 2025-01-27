package interfaceabstractpoly.onlinefooddelivery;

class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount(double percentage) {
        double discount = calculateTotalPrice() * (percentage / 100);
        return calculateTotalPrice() - discount;
    }

    @Override
    public String getDiscountDetails() {
        return "Discount applicable for Veg Items.";
    }
}
