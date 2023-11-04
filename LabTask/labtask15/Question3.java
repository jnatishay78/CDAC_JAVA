package LABTASK15;
import java.io.*;
public class Question3 {
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
        Question3 q3 = new Question3();
        q3.readPara();
    }
}