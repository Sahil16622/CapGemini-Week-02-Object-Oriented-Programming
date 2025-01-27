package inheritance.hierarchicalinheritance.schoolsystem;

public class Staff extends Person {
    String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public void displayRole() {
        System.out.println(name + " is a Staff member in the " + department + " department.");
    }
}