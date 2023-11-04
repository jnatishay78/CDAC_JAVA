/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabTask16;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Question1a {
    public static void main(String[] args) {
       
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        Date currentDate = new Date();

        String formattedDate = dateFormat.format(currentDate);
        System.out.println("Formatted Date: " + formattedDate);
    }
}

