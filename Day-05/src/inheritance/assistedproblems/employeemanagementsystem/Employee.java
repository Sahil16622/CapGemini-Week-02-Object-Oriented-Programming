package inheritance.assistedproblems.employeemanagementsystem;

public class Employee {
    protected String name;
    protected int id;
    protected Double salary;

    public Employee(String name, int id, Double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name of the Employee:" + name);
        System.out.println("ID of Employee:" + id);
        System.out.println("Salary of the Employee:" + salary);
    }
}
