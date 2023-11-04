/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author user
 */

class Parent{
    int a=10;
    void show(){
        System.out.println("a= "+a);
    }
}

class Child extends Parent{
    int b=20;
    void display(){
        System.out.println("b= "+b);
    }
}
public class TestingSingleInheritance {
    public static void main(String[] args) {
        /*Parent p = new Parent();
        System.out.println(p.a);
        p.show();
        
        Child c = new Child();
        System.out.println(c.b);
        c.display();*/
        
        Child c = new Child();
        c.show();
        c.display();
    }
}
