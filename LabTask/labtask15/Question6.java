/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LABTASK15;
import java.io.*;
public class Question6 {
    
    void copyFile(){
        int i;
        try(FileInputStream fin = new FileInputStream("C:\\Users\\user\\Downloads\\Atishay\\laveena.jpeg");
                            FileOutputStream fout = new FileOutputStream("C:\\Users\\user\\Downloads\\Atishay\\laveena\\lavina.png")){
            do{
                i=fin.read();
                fout.write(i);
            }while(i!=-1);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        Question6 q6 = new Question6();
        q6.copyFile();
    }
}