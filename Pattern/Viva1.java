/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pattern_By_Anup_Sir;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class Viva1 {
    

    public static void main(String[] args) {
        int numRows = 6;

        for (int i = 1; i <= numRows; i++) {
            for (int j = 5; j >=i; j--) {
                System.out.print(" ");
                for (int k = 1; k <= i; k++) {
                    System.out.print("*");
                }
            System.out.println(" "); // Move to the next row
            }
        }
    }
}
