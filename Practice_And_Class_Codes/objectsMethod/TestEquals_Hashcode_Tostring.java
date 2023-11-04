package objectsMethod;
import java.util.LinkedHashSet;
class Student{
    private String name;
    private int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;}
//    @Override
//    public int hashCode() {
//        return this.age;}
//    @Override
//    public String toString() {
//        return "Name=" + name +", Age=" + age+"\n";}
//    @Override
//    public boolean equals(Object obj) {
//        Student stud = (Student)obj;
//        return this.name.equals(stud.name) && this.age==stud.age;}
}
public class TestEquals_Hashcode_Tostring {
    public static void main(String[] args) {
        Student s1 = new Student("Ramesh", 40);
        Student s2 = new Student("Ramesh", 40);
        Student s3 = new Student("Suresh", 40);
        Student s4 = new Student("Bhavesh", 45);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
//        System.out.println(s1);
//       System.out.println(s1==s2);
//       System.out.println(s1.equals(s2));
//       System.out.println(s1);
//       System.out.println(s1.toString());
//       System.out.println(s1.hashCode());
//         LinkedHashSet<Student>studs = new LinkedHashSet<>();
//         studs.add(s1);
//         studs.add(s2);
//         studs.add(s3);
//         studs.add(s4);
//         studs.add(12);
//         studs.add(13);
//         studs.add(12);
//         studs.add(15);
//         System.out.println(studs);}}    
    }
}    
