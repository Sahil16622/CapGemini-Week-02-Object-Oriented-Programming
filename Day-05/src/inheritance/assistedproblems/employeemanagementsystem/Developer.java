package inheritance.assistedproblems.employeemanagementsystem;

public class Developer extends Employee {
    String programmingLanguage;

    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;

        System.out.println("Programming Language chosen by Developer is:" + programmingLanguage);
    }
}