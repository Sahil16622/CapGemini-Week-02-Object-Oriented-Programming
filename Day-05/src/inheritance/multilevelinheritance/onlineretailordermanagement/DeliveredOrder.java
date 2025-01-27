package inheritance.multilevelinheritance.onlineretailordermanagement;

public class DeliveredOrder extends ShippedOrder{

    String deliveryDate;

    public DeliveredOrder(int orderId, String orderDate, int trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public void getOrderStatus() {
        super.getOrderStatus();
        System.out.println("Delivery date of order is: "+deliveryDate);
    }
}
