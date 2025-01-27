package inheritance.multilevelinheritance.onlineretailordermanagement;

public class Order{
    protected int orderId;
    protected String orderDate;

    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public void getOrderStatus(){
        System.out.println("Order date of order having order id: "+orderId+ " is :"+orderDate);
    }
}