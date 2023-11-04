package labtask5;
public class Prog3 {
    int value;
    
    public Prog3(){
        value=0;
}
    
    public Prog3(int v){
        value=v;
    }
    
    int getValue(){
        return value;
    }
    
    public static void main(String[] args) {
        Prog3 p = new Prog3();
        System.out.println("Using Default Constructor: " + p.getValue());

        Prog3 p1 = new Prog3(42);
        System.out.println("Using Parameterized Constructor: " + p1.getValue());
    }
}
