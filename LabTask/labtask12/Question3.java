/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Labtask12;
import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a number (double): ");
        double userInput = scanner.nextDouble();

     
        Double result = calculateSquare(userInput);
        System.out.println("The square of " + userInput + " is: " + result);
    }

   
    private static Double calculateSquare(Double number) {
        return Math.pow(number, 2);
    }
}
