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
public class ReadParagraph {
    void readPara() throws IOException{
        String str[]=new String[100];
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Provide sentences to read its paragraph: ");
        for(int i=0;i<str.length;i++){
            str[i]=br.readLine();
            if(str[i].equals("stop"))
                break;
        }
        System.out.println("\n\n\nProvided Paragraph is: ");
        for(int i=0;i<str.length;i++){
            if(str[i].equals("stop"))
                break;
            System.out.println(str[i]);
    }
    }
    
    public static void main(String[] args) throws IOException {
        ReadParagraph rp = new ReadParagraph();
        rp.readPara();
    }
}
