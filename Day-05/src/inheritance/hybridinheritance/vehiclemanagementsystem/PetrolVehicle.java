package inheritance.hybridinheritance.vehiclemanagementsystem;

public class PetrolVehicle extends Vehicles implements Refuelable {
    public PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    @Override
    public void refuel() {
        System.out.println("Refueling...");
    }

    @Override
    public void display() {
        System.out.println("Petrol Vehicle...");
        super.display();
        refuel();
    }
}