/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabTask16;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Question1b{
    public static void main(String[] args) {
       
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");


        Date currentTime = new Date();

        
        String formattedTime = timeFormat.format(currentTime);
        System.out.println("Formatted Time: " + formattedTime);
    }
}
