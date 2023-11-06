/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_1;
public class Question9 {
    public static void main(String[] args) {
        int size = 7; 
        char initialA = 'A';
        char initialJ = 'J';

        for (int i = 0; i < size; i++) {
            // Print 'A'
            for (int j = 0; j < size; j++) {
                if ((i == 0 && j == size / 2) || (j == 0 || j == size - 1) || (i == size / 2)) {
                    System.out.print(initialA);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            for (int j = 0; j < size; j++) {
                if (i == 0 || (j == size / 2 && i != size - 1) || (i == size - 1 && j <= size / 2) ) {
                    System.out.print(initialJ);
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
