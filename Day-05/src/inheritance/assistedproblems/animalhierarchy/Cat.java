package inheritance.assistedproblems.animalhierarchy;

// Subclass Cat
public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " meows: Meow! Meow! and age is:" + age);
    }
}