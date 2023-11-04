/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Labtask12;

public class Question1 {

    public static void main(String[] args) {
        // Autoboxing
        int primitiveInt1 = 5;
        int primitiveInt2 = 10;
        Integer wrappedInt1 = primitiveInt1; 
        Integer wrappedInt2 = primitiveInt2; // Autoboxing

        System.out.println("Autoboxing");
        System.out.println("Primitive int 1: " + primitiveInt1);
        System.out.println("Primitive int 2: " + primitiveInt2);
        System.out.println("Wrapped Integer 1: " + wrappedInt1);
        System.out.println("Wrapped Integer 2: " + wrappedInt2);

       
        Integer sum = wrappedInt1 + wrappedInt2; 

        System.out.println("Sum of autoboxed Integers: " + sum);

        int result = sum; // Unboxing

        System.out.println("\nUnboxing");
        System.out.println("Result after unboxing: " + result);
    }
}
