package iotest.serial;
import java.io.*;

class Student implements Serializable{
     String name;
     int age;
     transient String password;
public Student(String name, int age, String password){
    this.name=name;
    this.age=age;
    this.password=password;
}}
public class TestSerialization {
    public static void main(String[] args) {
        try(FileOutputStream fout = new FileOutputStream("stud.ser");
                ObjectOutputStream oos = new ObjectOutputStream(fout)){
            Student student = new Student("Atishay",23,"Lavu");
            oos.writeObject(student);
            System.out.println("Object Serialized Succesfully.....");}
        catch(Exception e){
            System.out.println(e.getMessage());
        }}}
