/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabTask16;
import java.text.SimpleDateFormat;
import java.util.Date;

public class question1c {
    public static void main(String[] args) {
      
        SimpleDateFormat customDateFormat = new SimpleDateFormat("MMM dd, yyyy");

   
        Date customDate = new Date(122, 3, 15); 

     
        String formattedCustomDate = customDateFormat.format(customDate);
        System.out.println("Formatted Custom Date: " + formattedCustomDate);
    }
}
