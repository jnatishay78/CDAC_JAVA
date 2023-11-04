
package LabTask14;
class NegativeValueException extends Exception {
    public NegativeValueException(String message) {
        super(message);
    }
}

public class Question2 {
    public static void main(String[] args) {
        
        int userInput = -5;

        try {
           
            if (userInput < 0) {
                throw new NegativeValueException("Error: Negative values are not allowed.");
            }

            System.out.println("Entered value is: " + userInput);
        } catch (NegativeValueException e) {
         
            System.out.println(e.getMessage());
        }
    }
}
