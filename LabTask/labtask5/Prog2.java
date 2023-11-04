package labtask5;
import java.util.*;
public class Prog2 {
    // Instance variables
    int firstNumber;
    int secondNumber;

    // Parameterized constructor with user input
    public Prog2() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        secondNumber = scanner.nextInt();
    }

    int getFirstNumber() {
        return firstNumber;
    }

    int getSecondNumber() {
        return secondNumber;
    }
    
    public static void main(String[] args) {
        // Creating an instance of UserInputClass with user input
        Prog2 p = new Prog2();

        System.out.println("First Number: " + p.getFirstNumber());
        System.out.println("Second Number: "+p.getSecondNumber());
    }
}
