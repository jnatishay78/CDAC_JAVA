/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask17;
import java.util.ArrayList;
public class Question3 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        String str = "Orange";
        colors.add(0, str);

        System.out.println("ArrayList after inserting at the first position:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}


