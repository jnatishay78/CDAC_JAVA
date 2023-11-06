package Assignment_1;
import java.util.Scanner;

class StudInfo {
    protected String name;
    protected int rollNumber;

    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name: ");
        name = scanner.nextLine();
        System.out.println("Enter roll number: ");
        rollNumber = scanner.nextInt();
    }
}

class Marks extends StudInfo {
    protected double Maths;
    protected double Science;
    protected double English;

    public void getMarks() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks in Math: ");
        Maths = scanner.nextDouble();
        System.out.println("Enter marks in Science: ");
        Science = scanner.nextDouble();
        System.out.println("Enter marks in English: ");
        English = scanner.nextDouble();
    }

    public void calculatePercentage() {
        double totalMarks = Maths + Science + English;
        double percentage = (totalMarks / 300) * 100;
        System.out.println("Student Information:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Math Marks: " + Maths);
        System.out.println("Science Marks: " + Science);
        System.out.println("English Marks: " + English);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
    }
}

public class Question2 {
    public static void main(String[] args) {
        Marks[] students = new Marks[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter information for Student " + (i + 1) + ":");
            students[i] = new Marks();
            students[i].getData();
            students[i].getMarks();
        }
        for (int i = 0; i < 3; i++) {
            students[i].calculatePercentage();
        }
    }
}
