package interfaceabstractpoly.employeemanagement;

public class UseEmployee {
    public static void main(String[] args)
    {
        // Create FullTimeEmployee and PartTimeEmployee objects
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(1, "Sahil Singh Chauhan", 5000, 1000);
        fullTimeEmployee.assignDepartment("Engineering");

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(2, "Vishal Ahuja", 2000, 20, 50);
        partTimeEmployee.assignDepartment("Support");

        // Display details for FullTimeEmployee
        System.out.println("Full-Time Employee Details:");
        fullTimeEmployee.displayDetails();
        System.out.println(fullTimeEmployee.getDepartmentDetails());
        System.out.println("");

        // Display details for PartTimeEmployee
        System.out.println("Part-Time Employee Details:");
        partTimeEmployee.displayDetails();
        System.out.println(partTimeEmployee.getDepartmentDetails());
        System.out.println("");

    }
}
