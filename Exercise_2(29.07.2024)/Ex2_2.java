/*To create method that takes an integer as a parameter throws an exception
if the number is odd*/
import java.util.Scanner;

class OddNumberException extends Exception {
    public OddNumberException(String message) {
        super(message);
    }
}
public class Ex2_2 {

    public static void checkOddNumber(int number) throws OddNumberException {
        if (number % 2 != 0) {
            throw new OddNumberException("The number " + number + " is odd.");
        } else {
            System.out.println("The number " + number + " is even.");
        }
    }
    
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = obj.nextInt();
        
        try {
            checkOddNumber(num); 
        } catch (OddNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}
