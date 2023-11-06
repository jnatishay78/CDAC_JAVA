package Assignment_1;
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }

    void fetch() {
        System.out.println("Dog fetches a ball");
    }
}

public class Question5 {
    public static void main(String[] args) {
        // Upcasting: Casting a subclass object to a superclass reference
        Animal animal = new Dog(); // Upcasting

        // Accessing the overridden method in the subclass
        animal.makeSound(); // Calls Dog's makeSound()

        // Compile-time error if you try to access the subclass-specific method
        // animal.fetch(); // Error: Cannot find symbol

        // Downcasting: Casting a superclass reference back to a subclass reference
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal; // Downcasting

            // Now we can access the subclass-specific method
            dog.fetch();
        } else {
            System.out.println("Animal is not a Dog");
        }
    }
}

