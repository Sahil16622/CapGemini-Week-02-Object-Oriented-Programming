package inheritance.assistedproblems.animalhierarchy;

// Subclass Dog
class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " barks: Woof! Woof! and age is:" + age);
    }
}