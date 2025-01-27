package inheritance.multilevelinheritance.onlineretailordermanagement;

public class UseOrder{
    public static void main(String[] args) {
        Order order = new Order(101,"24 jan 2025");
        order.getOrderStatus();
        System.out.println();
        order = new ShippedOrder(101,"24 Jan 2025",234544);
        order.getOrderStatus();
        System.out.println();
        order =  new DeliveredOrder(101,"24 Jan 2025",234544,"29 Jan 2025");
        order.getOrderStatus();
    }
}
