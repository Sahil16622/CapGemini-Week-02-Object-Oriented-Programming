package interfaceabstractpoly.vehiclerentalsystem;

// Bike class
class Bike extends Vehicle implements Insurable {
    private String policyNumber;

    public Bike(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.policyNumber = policyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 0.9; // 10% discount on rental cost for bikes
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.03; // 3% of rental rate as insurance
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance Policy Number: " + policyNumber;
    }
}
