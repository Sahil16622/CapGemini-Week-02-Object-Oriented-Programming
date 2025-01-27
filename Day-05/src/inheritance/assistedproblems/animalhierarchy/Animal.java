package inheritance.assistedproblems.animalhierarchy;

// Superclass Animal
class Animal {
    String name;
    int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // General makeSound method to be overridden
    public void makeSound() {
        System.out.println("Animal makes different sounds");
    }
}