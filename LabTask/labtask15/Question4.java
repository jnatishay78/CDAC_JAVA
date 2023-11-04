/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LABTASK15;

import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author user
 */
public class Question4 {
    
    
    void readFile() throws IOException{
        int i;
        try(FileInputStream fin=new FileInputStream("C:\\Users\\user\\OneDrive\\Desktop\\abc.txt")){ 
        do{
         i=fin.read();
            System.out.print((char)i);
        }while(i!=-1);
      }
      catch(Exception e){
          System.out.println(e.getMessage());
      }
    }
    
    
    
    public static void main(String[] args) throws IOException{
        Question4 q4 = new Question4();
        q4.readFile();
    }
}