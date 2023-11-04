
package LabTask14;


public class Question1 {
    public static void main(String[] args) {
       
        int[] numbers = {1, 2, 3, 4, 5};

        
        int indexToAccess = 7;

        try {
            int value = numbers[indexToAccess];
            System.out.println("The value at index " + indexToAccess + " is: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
           
            System.out.println("Error: Array index " + indexToAccess + " is out of bounds. Array length is " + numbers.length);
        }
    }
}
