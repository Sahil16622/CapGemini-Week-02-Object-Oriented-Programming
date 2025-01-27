package inheritance.assistedproblems.vehicleandtransportsystem;

public class MotorCycle extends Vehicle {
    int average;

    public MotorCycle(int maxSpeed, String fuelType, int average) {
        super(maxSpeed, fuelType);
        this.average = average;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Average if Bike is :" + average);
    }
}
