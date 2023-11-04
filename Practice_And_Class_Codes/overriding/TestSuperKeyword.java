package overriding;
class Animal{
        int a=10;
        
        public Animal(){
        }
        public Animal(int a){
            this.a = a;
        }
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
    int a=100;
    public Cat(){
        super(1100);
    }
    void animalSound(){
        System.out.println("Cat Meow..."+super.a);
        super.animalSound();
    }
}
public class TestSuperKeyword {
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
