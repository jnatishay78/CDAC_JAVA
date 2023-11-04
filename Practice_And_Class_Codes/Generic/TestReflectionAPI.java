package Generic;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
class Person{
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    private void showInfo(){
        System.out.println("Hello "+name+", your age is "+age);
    }
}

public class TestReflectionAPI{
    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException { 
        Class personCls = Person.class;
        
        Constructor cons = personCls.getDeclaredConstructor(String.class,int.class);
        Object obj = cons.newInstance("Atishay",23);
        
        Field fname = personCls.getDeclaredField("name");
        fname.setAccessible(true);
        fname.set(obj, "Laveena");
        Field fage = personCls.getDeclaredField("age");
        fage.setAccessible(true);
        fage.set(obj,22);
        
        Method m = personCls.getDeclaredMethod("showInfo");
        m.setAccessible(true);
        m.invoke(obj);
        
        String s = (String)fname.get(obj);
        System.out.println(s);
        
        int age = fage.getInt(obj);
        System.out.println(age);
    }
}
