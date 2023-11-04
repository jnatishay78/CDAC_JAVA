package Generic;

import java.util.List;

class Container<T,V>{
    T contain;

    public Container(T contain) {
        this.contain = contain;
    }

    public T getContain() {
        return contain;
    }
    
    public List showData(List<? super V> data){
        return data;
    }
    public void showType(){
        System.out.println(contain.getClass().getName());
    }
}
public class GenericCls {
    public static void main(String[] args) {
        Container<String,Integer> c = new Container<>("Cdac");
        String s = c.getContain();
        System.out.println(c.getContain());
        System.out.println(c.showData(List.of(101,102,103,104)));
        List<Number> lst = List.of(101.13,102.23,103.33,104.44);
        System.out.println(c.showData(lst));
        c.showType();
    }
}
