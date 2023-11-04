/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Labtask12;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Convert primitive int to Integer object
        System.out.print("Enter an integer: ");
        int primitiveInt = scanner.nextInt();
        Integer integerObject = Integer.valueOf(primitiveInt);
        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Integer object: " + integerObject);

        // Convert primitive float to Float object
        System.out.print("Enter a float: ");
        float primitiveFloat = scanner.nextFloat();
        Float floatObject = Float.valueOf(primitiveFloat);
        System.out.println("Primitive float: " + primitiveFloat);
        System.out.println("Float object: " + floatObject);

        scanner.close();
    }
}
