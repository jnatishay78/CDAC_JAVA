package LABTASK15;
import java.io.*;

public class Question2 {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\user\\OneDrive\\Desktop\\abc.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

