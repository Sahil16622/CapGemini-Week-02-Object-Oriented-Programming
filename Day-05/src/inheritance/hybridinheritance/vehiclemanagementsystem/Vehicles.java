package inheritance.hybridinheritance.vehiclemanagementsystem;

public class Vehicles {
    private int maxSpeed;
    private String model;

    public Vehicles(int maxSpeed, String model) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public void display() {
        System.out.println("Model : " + model);
        System.out.println("Max Speed : " + maxSpeed + "km/h");
    }

}