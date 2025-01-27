package inheritance.assistedproblems.vehicleandtransportsystem;

public class UseVehicle{
    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car(150, "Petrol", 5);
        vehicles[1] = new Truck(90, "Diesel", 4000);
        vehicles[2] = new MotorCycle(140, "Petrol", 65);

        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            System.out.println();
        }
    }
}