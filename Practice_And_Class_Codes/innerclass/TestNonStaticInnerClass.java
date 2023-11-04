package innerclass;
class Outer{
    int x=100;
    class InnerNonStatic{
        int y=200;
        public void show(){
            System.out.println("I am from Non Static Class");
            System.out.println("Value of x+y is: "+(x+y));
        }
    }
}
public class TestNonStaticInnerClass {
    public static void main(String[] args) {
        Outer o = new Outer();
        
        Outer.InnerNonStatic obj = o.new InnerNonStatic();
        obj.show();
    }
}
