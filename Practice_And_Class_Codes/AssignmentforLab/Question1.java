package AssignmentforLab;
import java.util.*;
public class Question1 {
    public static void main(String[] args) {
        String inputString = "My name is Atishay Jain, I am from Agra and persuing PG-Diploma from Soft Polynomials Nagpur";
        String[] words = inputString.split(" ");
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words.length - 1 - i; j++) {
                if (words[j].compareTo(words[j + 1]) > 0) {
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }

        String sortedString = String.join(" ", words);

        System.out.println("Original String: " + inputString);
        System.out.println("Sorted String: " + sortedString);
    }
}
