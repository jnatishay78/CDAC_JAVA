package innerclass;

class ParentofAnonymous{
    void greeting(){
        System.out.println("Say Hello");
    }
}
/*interface ParentofAnonymous{
    public void greeting();
    void show();
}*/
class Outer{
    ParentofAnonymous p = new ParentofAnonymous(){   // this is anonymous inner class
        @Override
        void greeting() {
            System.out.println("Say Namaste........");
        }
    }; 
}

public class TestAnonymousClass {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.p.greeting();
    }
}
