package labtask3;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        boolean divisibleBy8 = (number % 8 == 0);
        boolean divisibleBy5 = (number % 5 == 0);

        if (divisibleBy8 && divisibleBy5) {
            System.out.println(number + " is divisible by 8 and 5.");
        } else if (divisibleBy8) {
            System.out.println(number + " is divisible by 8.");
        } else if (divisibleBy5) {
            System.out.println(number + " is divisible by 5.");
        } else {
            System.out.println(number + " is neither divisible by 8 nor by 5.");
        }

        scanner.close();
    }
}
