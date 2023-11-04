package inheritance;
class GrandParent{
    int x =100;
    void test(){
        System.out.println("Value of x: "+x);
    }
}
class Parent extends GrandParent{
    int a=10;
    void show(){
        System.out.println("Value of a: "+a);
    }
}

class Child extends Parent{
    int b=20;
    void display(){
        System.out.println("Value of x: "+b);
    }
}
public class TestMultiLevelInheritance {
    public static void main(String[] args) {
        Child c = new Child();
        c.test();
        c.show();
        c.display();
    }
}
