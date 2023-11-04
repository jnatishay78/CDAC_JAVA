package LABTASK15;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 *
 * @author user
 */
public class Question7 {
    public static void main(String[] args) {
        try{
            Path p = Paths.get("D:\\DailyInterview\\ATISHAYJ");
            Path p1 = Files.createDirectory(p);
            Path path=Paths.get("D:\\DailyInterview\\ATISHAYJ\\example.txt");
            String content="Soft Polynomials Pvt Ltd,Nagpur";
            for(int i=0;i<10;i++)
                Files.write(path,content.getBytes(),StandardOpenOption.APPEND);
            System.out.println("Directory Created And Operations performed......");
            
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    }
