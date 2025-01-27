package inheritance.assistedproblems.animalhierarchy;

public class UseAnimal {
    public static void main(String[] args) {
        Dog dog = new Dog("Dobby", 7);
        dog.makeSound();

        Cat cat = new Cat("Sweetu", 6);
        cat.makeSound();

        Bird bird = new Bird("Tweetu", 8);
        bird.makeSound();
    }
}
