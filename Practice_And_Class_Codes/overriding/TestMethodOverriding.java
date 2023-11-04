package overriding;
class Animal{
    void animalSound(){
        System.out.println("Generic Animal Sound");
    }
}

class Dog extends Animal{
    void animalSound(){
        System.out.println("Dog Barks...");
    }
}

class Cat extends Animal{
    void animalSound(){
        System.out.println("Cat Meow...");
    }
}

public class TestMethodOverriding {
    public static void main(String[] args) {
//        Dog d = new Dog();
//        Cat c = new Cat();
//        d.animalSound();
//        c.animalSound();
        
        Animal a;
//      a = new Animal();
//      a = new Dog();
        a = new Cat();
        a.animalSound();
    }
}
