package Generic;
import java.util.List;
public class GenericMethods {
//     public static <E>void showData(List<E> lst){
//        for(E s:lst)
//           System.out.println(s);
//    }
    
    
//    public static <E>void showData(E arr[]){
//        for(E s:arr)
//           System.out.println(s);
//    }
    
    //Upper Bound
//   public static <E>void showData(List<? extends Number> lst){
//        for(Number s:lst)
//           System.out.println(s);
//    }
   
   //Lower Bound
   public static void showData(List<? super Integer> lst){
        for(Object s:lst)
           System.out.println(s);
    }
    
    public static void main(String[] args) {
//        String names[]={"Atishay","Laveena","Purti","Parul"};
//        Integer ages[] =  {23,22,28,22};
//        Double dages[] =  {23.00,22.00,28.00,22.00};
//        showData(names);
//        showData(ages);
//        showData(dages);
          
//          List lst1 = List.of("Atishay","Laveena","Purti","Parul");
//          List lst2 = List.of(23,22,28,22);
//          showData(lst1);
//          showData(lst2);


//           List lst1 = List.of("Atishay","Laveena","Purti","Parul");
           List<Integer> lst2 = List.of(23,22,28,22);
           List<Number> lst3 = List.of(23.23,22.22,28.28,22.22);
//           showData(lst1);
           showData(lst2);
           showData(lst3);
    }
}
