package overriding;
class Test{
    int a;
    
    public Test(){
        this(222);
        a=10;
    }
    
    public Test(int x){
        a=x;
        showA();
    }
    void showA(){
        System.out.println("Value of A: "+a);
    }
}

public class TestThisKeyword {
    public static void main(String[] args) {
        Test t = new Test();
        //Test t1 = new Test(500);
        //System.out.println(t.a);
        //System.out.println(t1.a);
        t.showA();
    }
}

/*class Test{
    int a;
    
    public Test(){
        this(222);
        a=10;
    }
    
    public Test(int a){
        this.a = a;
        showA();
    }
    void showA(){
        System.out.println("Value of A: "+a);
    }
}

public class TestSuperKeyword {
    public static void main(String[] args) {
        Test t = new Test();
        //Test t1 = new Test(500);
        //System.out.println(t.a);
        //System.out.println(t1.a);
        t.showA();
    }
}*/