package inheritance.assistedproblems.employeemanagementsystem;

public class Manager extends Employee {
    int teamSize;

    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;

        System.out.println("Team size of manager:" + teamSize);

    }
}