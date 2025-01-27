package inheritance.multilevelinheritance.onlineretailordermanagement;

public class ShippedOrder extends Order{
    int trackingNumber;

    public ShippedOrder(int orderId, String orderDate, int trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public void getOrderStatus() {
        super.getOrderStatus();
        System.out.println("Tracking no of Order id is: "+trackingNumber);
    }
}
