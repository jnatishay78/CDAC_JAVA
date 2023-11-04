package inheritance;

class Parent{
    int a=10;
    void show(){
        System.out.println("Parent a value: "+a);
    }
    
}

class Child1 extends Parent{
    int x=100;
    void display(){
        System.out.println("Child1 x value: "+x);
    }
}


class Child2 extends Parent{
    int x=200;
    void display(){
        System.out.println("Child1 x value: "+x);
}
}

class Child3 extends Parent{
    int x=300;
    void display(){
        System.out.println("Child1 x value: "+x);
}
}

public class TestHierarchicalInheritance {
        public static void main(String[] args) {
        Child1 c1 = new Child1();
        Child2 c2 = new Child2();
        Child3 c3 = new Child3();
        c1.show();
        c1.display();
        c2.show();
        c2.display();
        c3.show();
        c3.display();
        
        
    }
}
