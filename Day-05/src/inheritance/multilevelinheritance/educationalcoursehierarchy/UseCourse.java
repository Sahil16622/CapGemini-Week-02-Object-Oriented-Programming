package inheritance.multilevelinheritance.educationalcoursehierarchy;

public class UseCourse {
    public static void main(String[] args) {
        // Example objects for testing
        Course basicCourse = new Course("Java Basics", 30);
        basicCourse.displayInfo();
        System.out.println();
        OnlineCourse freeOnlineCourse = new OnlineCourse("Python for Data Science", 40, "Coursera", true);
        freeOnlineCourse.displayInfo();
        System.out.println();
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Machine Learning", 50, "Udemy", true, 5000, 10);
        paidCourse.displayInfo();
    }
}
