package inheritance.hierarchicalinheritance.schoolsystem;

public class UsePerson{
    public static void main(String[] args) {
        // Create instances of each subclass
        Teacher teacher = new Teacher("Alice", 30, "Mathematics");
        Student student = new Student("Bob", 16, "10th Grade");
        Staff staff = new Staff("Charlie", 45, "Administration");

        teacher.displayInfo();
        teacher.displayRole();

        System.out.println();

        student.displayInfo();
        student.displayRole();

        System.out.println();

        staff.displayInfo();
        staff.displayRole();
    }
}

