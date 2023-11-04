/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Labtask12;

/**
 *
 * @author laveena
 */
public class Question2 {

    public static void main(String[] args) {
        Integer originalValue = 5;

        System.out.println("Original value: " + originalValue);

        incrementInteger(originalValue);

    
    }

   
    private static void incrementInteger(Integer value) {
    
        value = value + 1;

        System.out.println("Incremented value: " + value);
    }
}
