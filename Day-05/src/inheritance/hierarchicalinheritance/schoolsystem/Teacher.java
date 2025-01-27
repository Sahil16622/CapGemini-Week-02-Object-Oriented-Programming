package inheritance.hierarchicalinheritance.schoolsystem;

public class Teacher extends Person {
    String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void displayRole() {
        System.out.println(name + " is a Teacher who teaches " + subject + ".");
    }
}