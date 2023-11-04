package labtask6;
class Animal {
    public void speak() {
        System.out.println("Animal speaks");
    }
    protected void eat() {
        System.out.println("Animal eats");
    }
    void sleep() {
        System.out.println("Animal sleeps");
    }
    private void move() {
        System.out.println("Animal moves");
    }
}
class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("Dog barks");
    }
    @Override
    protected void eat() {
        System.out.println("Dog eats");
    }
    @Override
    void sleep() {
        System.out.println("Dog sleeps");
    }
}

public class prog1 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        dog.speak(); 
        dog.eat(); 
        dog.sleep();
    }
}
