package inheritance.hybridinheritance.vehiclemanagementsystem;

public class UseVehicle {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle(80, "Tata Nexon.ev");
        PetrolVehicle pv = new PetrolVehicle(160, "Hyundai Creta");
        ev.display();
        System.out.println("------------------------------");
        pv.display();
    }
}
