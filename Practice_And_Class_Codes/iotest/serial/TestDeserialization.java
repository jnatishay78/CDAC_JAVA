package iotest.serial;
import java.io.*;
public class TestDeserialization {
    public static void main(String[] args) {
        try(FileInputStream fin = new FileInputStream("stud.ser");
                ObjectInputStream ois = new ObjectInputStream(fin)) {
                Student s=(Student)ois.readObject();
                System.out.println("Name: "+s.name);
                System.out.println("Age: "+s.age);
                System.out.println("Password: "+s.password);
        }
        catch(Exception e){
            System.out.println(e.getMessage());}}}
