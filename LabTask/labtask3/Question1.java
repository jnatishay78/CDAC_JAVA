/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask3;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalMarks = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter marks for Paper(out of 50): " + i + ": ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }

        scanner.close();

        double percentage = (double) totalMarks / (5 * 50) * 100;

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");

        String grade = calculateGrade(percentage);
        System.out.println("Grade: " + grade);
    }

    public static String calculateGrade(double percentage) {
        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B+";
        } else if (percentage >= 60) {
            return "B";
        } else if (percentage >= 50) {
            return "C";
        } else {
            return "Fail";
        }
    }
}
