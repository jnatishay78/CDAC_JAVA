
package LABTASK7;


abstract class Person1 {
  
    public abstract void eat();
    public abstract void exercise();
}


class Athlete extends Person1 {
   
    @Override
    public void eat() {
        System.out.println("An athlete eats a balanced diet to stay fit.");
    }

   
    @Override
    public void exercise() {
        System.out.println("An athlete engages in rigorous training sessions.");
    }
}


class LazyPerson extends Person1 {
  
    @Override
    public void eat() {
        System.out.println("A lazy person may opt for convenient but unhealthy food choices.");
    }

    @Override
    public void exercise() {
        System.out.println("A lazy person tends to avoid regular exercise.");
    }
}


public class Person {
    public static void main(String[] args) {
   
        Athlete athlete = new Athlete();
        LazyPerson lazyPerson = new LazyPerson();

        System.out.println("Athlete's Routine:");
        athlete.eat();
        athlete.exercise();

        System.out.println();

        System.out.println("Lazy Person's Routine:");
        lazyPerson.eat();
        lazyPerson.exercise();
    }
}

