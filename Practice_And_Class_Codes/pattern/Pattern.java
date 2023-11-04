/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pattern;

public class Pattern {
    public static void main(String[] args) {
        int size =9; 
        char ch1 = 'P';
        char ch2 = 'M';

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((j == 0) || (i==0 && j == 1) || (i==0 && j == 2) || (i==4 && j == 1) || (i==4 && j == 2) ||(i==1 && j == 3) || (i==2 && j == 3) || (i==3 && j == 3)) {
                    System.out.print(" "+ch1);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");
            for (int j = 0; j <size; j++) {
                if (j == 1 || j == 7 || (i==1&&j==2) || (i==2&&j==3) || (i==3&&j==4) || (i==2&&j==5) || (i==1&&j==6)){
                    System.out.print(" "+ch2);
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
