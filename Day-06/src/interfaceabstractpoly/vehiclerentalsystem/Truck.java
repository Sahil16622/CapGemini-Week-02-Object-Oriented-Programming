package interfaceabstractpoly.vehiclerentalsystem;

class Truck extends Vehicle implements Insurable {
    private String policyNumber;

    public Truck(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.policyNumber = policyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return (getRentalRate() * days) + (days > 5 ? 500 : 0); // Additional charge for rentals over 5 days
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.08; // 8% of rental rate as insurance
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Policy Number: " + policyNumber;
    }
}
