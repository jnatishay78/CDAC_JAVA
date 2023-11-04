/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LABTASK15;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Question5 {
    public static void main(String[] args) {
        try{
            Path path=Paths.get("C:\\Users\\user\\Downloads\\Atishay\\ati\\example1.txt");
            String content="Soft Polynomials Pvt Ltd,Nagpur";
                Files.write(path,content.getBytes(),StandardOpenOption.APPEND);
            System.out.println("Completed");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}