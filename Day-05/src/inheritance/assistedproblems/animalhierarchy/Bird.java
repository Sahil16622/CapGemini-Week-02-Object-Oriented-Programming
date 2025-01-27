package inheritance.assistedproblems.animalhierarchy;

// Subclass Bird
class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " chirps: chirp! chirp! and age is:" + age);
    }
}

