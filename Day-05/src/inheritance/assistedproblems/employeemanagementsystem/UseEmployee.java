package inheritance.assistedproblems.employeemanagementsystem;

public class UseEmployee{
    public static void main(String[] args) {

        Manager manager = new Manager("John", 101, 100000.0, 10);
        manager.displayDetails();
        System.out.println();
        Intern intern = new Intern("Andrew", 102, 50000, 12);
        intern.displayDetails();
        System.out.println();
        Developer developer = new Developer("James", 103, 40000, "Java");
        intern.displayDetails();
    }
}
