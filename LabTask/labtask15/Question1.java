/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LABTASK15;

import java.io.*;

/**
 *
 * @author user
 */
public class Question1 {
 
    void readLines() throws IOException{
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Provide sentences to read its lines: ");
        do{
        str=br.readLine();
            System.out.println(str);
    }while(!str.equals("stop"));
    }
    public static void main(String[] args) throws IOException {
        Question1 ql = new Question1();
        ql.readLines();
    }
}
