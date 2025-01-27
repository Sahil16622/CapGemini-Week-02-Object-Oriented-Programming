package interfaceabstractpoly.vehiclerentalsystem;

// Main class
public class UseVehicle {
    public static void main(String[] args) {
        // Create vehicles
        Vehicle car = new Car("C123", 1000, "CARPOL123");
        Vehicle bike = new Bike("B456", 500, "BIKEPOL456");
        Vehicle truck = new Truck("T789", 2000, "TRUCKPOL789");

        // Array of vehicles
        Vehicle[] vehicles = {car, bike, truck};

        // Iterate over the vehicles and calculate rental and insurance costs
        int rentalDays = 7;
        for (Vehicle vehicle : vehicles) {
            System.out.println("");
            double insuranceCost = 0;
            if (vehicle instanceof Insurable) {
                Insurable insurable = (Insurable) vehicle;
                insuranceCost = insurable.calculateInsurance();
                System.out.println(insurable.getInsuranceDetails());
            }
            vehicle.displayDetails(rentalDays, insuranceCost);
        }
    }
}
