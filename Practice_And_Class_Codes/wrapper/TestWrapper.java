package wrapper;
public class TestWrapper {
    public static void main(String[] args) {
        int x=10;
//        Integer i = new Integer(x);     //Boxing
//        int a=i.intValue();             //Un-Boxing
        
        Integer i=x;                      //AutoBoxing
        int a=i;                          //AutoUnboxing
        
        System.out.println("Primitive x = "+x);
        System.out.println("Reference x = "+i);
        

// String to corresponding numeric value
        String age = "25";
        int age1=Integer.parseInt(age);
        System.out.println(age1+5);        
    }
}
