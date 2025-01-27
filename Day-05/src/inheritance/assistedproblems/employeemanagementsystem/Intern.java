package inheritance.assistedproblems.employeemanagementsystem;

public class Intern extends Employee {
    int noOfProjects;

    public Intern(String name, int id, double salary, int noOfProjects) {
        super(name, id, salary);
        this.noOfProjects = noOfProjects;

        System.out.println("Number of projects done by intern is:" + noOfProjects);

    }
}