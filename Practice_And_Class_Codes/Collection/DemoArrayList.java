package Collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DemoArrayList {
    public static void main(String[] args) {
        List list = new ArrayList();
//        List list1 = new ArrayList();
//        
//        list1.add('L');
//        list1.add('A');
//        list1.add('V');
//        list1.add('E');
//        list1.add('E');
//        list1.add('N');
//        list1.add('A');
//        System.out.println(list1);
//        
//        
//        list.add('D');
//        list.add('U');
//        list.add('D');
//        list.add('A');
//        list.add('N');
//        list.add('I');
//        System.out.println(list);
//        
//        
//        list.add(3, 'S');
//        System.out.println(list);
//        
//        
//        list.addAll(0,list1);
//        System.out.println(list);
//        
//        
//        list.remove(0);
//        System.out.println(list);
//        
//        System.out.println(list.get(3));
//        System.out.println(list.contains('N'));

         list.add(23);
         list.add(12.23);
         list.add("Laveena Dudani");
         list.add(new Date());
//         System.out.println(list);
         
         for(Object o: list){
             System.out.println(o);
         }
         System.out.println("****************************");
         Iterator itr=list.iterator();
         while(itr.hasNext())
             System.out.println(itr.next());
    }
}
