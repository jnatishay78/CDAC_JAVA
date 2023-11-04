/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IO_INPUTOUTPUT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author user
 */
public class ReadLines {
 
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
        ReadLines rl = new ReadLines();
        rl.readLines();
    }
}