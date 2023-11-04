package FileHandling;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class ReadAndCopyFile {
    
    void copyFile(){
        int i;
        try(FileInputStream fin = new FileInputStream("C:\\Users\\user\\Downloads\\Atishay\\lavu.jpeg");
                            FileOutputStream fout = new FileOutputStream("C:\\Users\\user\\Downloads\\Atishay\\laveena\\love.png")){
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
        ReadAndCopyFile racf = new ReadAndCopyFile();
        racf.copyFile();
    }
}
