/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgDemo.pack2;

/**
 *
 * @author user
 */
public class SecondDemo extends package_Demo.pack1.FirstDemo{
//    int x=100;
    int y=100;
    
    public void show1(){
        package_Demo.pack1.FirstDemo f = new package_Demo.pack1.FirstDemo();
        System.out.println("From Pak2 "+(y+x));
    }
    
}
