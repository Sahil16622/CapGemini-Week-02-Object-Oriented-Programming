package inheritance.assistedproblems.vehicleandtransportsystem;

public class Vehicle {
    protected int maxSpeed;
    protected String fuelType;

    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public void displayInfo() {
        System.out.println("Maximum Speed of vehicle is: " + maxSpeed);
        System.out.println("Fuel type of vehicle is: " + fuelType);
    }
}