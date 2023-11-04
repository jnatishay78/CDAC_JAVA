package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamAPIdemo {
    public static void main(String[] args) {
//        List<String> lst = List.of("Atishay","Laveena","Purti","Parul","Purnita","Priya");
//        for(String s:lst){
//            System.out.println(s);
//        }
//        System.out.println("************************");
//        lst.stream().forEach(e->System.out.println(e));
//        lst.stream().forEach(System.out::println); // Method Reference

          List<Integer> lst = List.of(13,13,12,11,10,9,8,7,6,5,4,3,2,1);
          System.out.println(lst);
//          List<Integer> evenlst = lst.stream().filter(i->i%2==0).collect(Collectors.toList());
//          System.out.println(evenlst);

//          Set<Integer>st=lst.stream().map(i->i*i*i).collect(Collectors.toSet());
//          System.out.println(st);

            lst.stream().sorted((x,y)->x.compareTo(y)).forEach(System.out::println);
            
            Integer i1 = lst.stream().min((x,y)->x.compareTo(y)).get();
            System.out.println(i1);
            Integer i = lst.stream().max((x,y)->x.compareTo(y)).get();
            System.out.println(i);
            
            String name[] = {"Atishay","Laveena","Purti","Parul","Purnita","Priya"};
            Arrays.stream(name).filter(e->e.startsWith("L")).forEach(System.out::println);
    }      
}
