package interfaceabstractpoly.ridehailingapp;

public class UseVehicle {
    public static void main(String[] args) {
        // Create vehicles
        Vehicle car = new Car("C001", "John Doe", 12.0, "Downtown");
        Vehicle bike = new Bike("B001", "Jane Smith", 8.0, "City Center");
        Vehicle auto = new Auto("A001", "Raj Kumar", 10.0, "Market Square");

        // Process rides
        processRide(car, 15.0); // Car ride for 15 km
        System.out.println("-------------------------------");
        processRide(bike, 10.0); // Bike ride for 10 km
        System.out.println("-------------------------------");
        processRide(auto, 12.0); // Auto ride for 12 km

        System.out.println("-------------------------------");

        // Update and display locations
        if (car instanceof GPS) {
            GPS carGPS = (GPS) car;
            System.out.println("Car current location: " + carGPS.getCurrentLocation());
            carGPS.updateLocation("Airport");
        }
    }

    // Method to process a ride and calculate fare
    public static void processRide(Vehicle vehicle, double distance) {
        vehicle.getVehicleDetails();
        System.out.println("Distance: " + distance + " km");
        System.out.println("Total Fare: " + vehicle.calculateFare(distance));
    }
}
