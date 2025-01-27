package interfaceabstractpoly.employeemanagement;

abstract class Employee {


    //Encapsulating the data members
    private int employeeID;
    private String name;
    private double baseSalary;

    //Initializing the values of data members in constructor
   public Employee(int employeeID, String name, double salary){
        this.employeeID = employeeID;
        this.name = name;
        this.baseSalary = baseSalary;
    }


    //Setting the respective values of data members
    public void setEmployeeID(int employeeID)
    {
        this.employeeID = employeeID;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setBaseSalary(double baseSalary)
    {
        this.baseSalary = baseSalary;
    }


    //Getting the values of data members to use
    public int getEmployeeID(){
        return employeeID;
    }

    public String getName(){
        return name;
    }

    public double getBaseSalary(){
        return baseSalary;
    }


    //creating an abstract method to return the salary amount
    public abstract double calculateSalary();


    //creating a concrete method to display the overall detail of an employee
    public void displayDetails(){
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Calculated Salary: " + calculateSalary());
    }
}
