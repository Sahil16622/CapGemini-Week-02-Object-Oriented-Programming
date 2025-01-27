package inheritance.hybridinheritance.vehiclemanagementsystem;

public class ElectricVehicle extends Vehicles {
    public ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    public void charge() {
        System.out.println("Electric vehicle Charging...");
    }

    @Override
    public void display() {
        System.out.println("Electric vehilce...");
        super.display();
        charge();
    }
}
