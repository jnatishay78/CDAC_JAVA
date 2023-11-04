/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iotest.niotest;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author user
 */
public class DirectoryCreation {
    public static void main(String[] args) {
        try{
            Path p = Paths.get("D:\\DailyInterview\\ATISHAY");
            Path p1 = Files.createDirectory(p);
            System.out.println("File Created");
            
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    }

