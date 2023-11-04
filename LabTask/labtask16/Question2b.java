/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabTask16;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class Question2b {
    public static void main(String[] args) {
        // Create a SimpleDateFormat object for the "dd/MM/yyyy" format
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a date in the format dd/MM/yyyy: ");
        String userInput = scanner.nextLine();

        try {
            // Parse the user input date string
            Date parsedDate = dateFormat.parse(userInput);

            // Print the parsed Date object
            System.out.println("Parsed Date: " + parsedDate);
        } catch (ParseException e) {
            // Handle any potential ParseException
            System.out.println("Error parsing the date: " + e.getMessage());
        }

        // Close the Scanner
        scanner.close();
    }
}
