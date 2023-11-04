
package Collection;

import java.util.Iterator;
import java.util.Vector;

public class StudentCollection {
    public static void main(String[] args) {
        Vector<Student> v= new Vector<>();
        Student s1 = new Student("Laveena",22);
        Student s2 = new Student("Atishay",23);
        Student s3 = new Student("Purti",29);
        Student s4 = new Student("Parul",24);
        
        v.add(s1);
          v.add(s2);
            v.add(s3);
              v.add(s4);
//              System.out.println(v);
//              System.out.println(v.get(1).getName());
//              System.out.println(v.get(1).getAge());
//              
              
              
            Iterator<Student> it=v.iterator();
            while(it.hasNext()){
                Student s=it.next();
                System.out.println("Name : "+s.getName()+"   Age : "+s.getAge());
        
            }
        
    }
    
}
