package innerclass;
class Outer{
    int x=10;
    static class InnerStatic{
        int y=20;
        void show(){
            Outer o = new Outer();
            System.out.println("I am from static inner class");
            System.out.println("Value of variable stored inside me is: "+(o.x+y));
        }
    }
}
public class TestStaticInnerClass {
    public static void main(String[] args) {
        Outer.InnerStatic obj = new Outer.InnerStatic();
        obj.show();
        
        
    }
}
