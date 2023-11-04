package labtask6;
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
    void animalSound() {
        super.makeSound();
    }
}

public class prog2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
    }
}

