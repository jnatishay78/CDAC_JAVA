package abstraction;
public interface StudentInter {
    int a=10; //by deafault public static final int a=10
    void showName(String name);//by default public abstract void showName
    void showAge(int Age);
    
    default void course(){
        System.out.println("Default Method of Interface");
    }
    
    static void institute(){
        System.out.println("This is static method");
    }
    
    private String exam(){
        return "CET";
    }
    private static String city(){
        return "Nagpur";
    }
}

