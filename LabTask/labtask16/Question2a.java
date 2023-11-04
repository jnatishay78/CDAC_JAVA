/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabTask16;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

public class Question2a {
    public static void main(String[] args) {
        // Create a SimpleDateFormat object for the "yyyy-MM-dd" format
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            // Parse the date string
            String dateString = "2023-10-23";
            Date parsedDate = dateFormat.parse(dateString);

            // Print the parsed Date object
            System.out.println("Parsed Date: " + parsedDate);
        } catch (ParseException e) {
            // Handle any potential ParseException
            System.out.println("Error parsing the date: " + e.getMessage());
        }
    }
}
