/* if number is less than 10 or greater than 15 it generate OutofRangeException otherwise it generates the square of the number */
import java.util.Scanner;

class OutofRangeException extends Exception{
    public OutofRangeException(String message){
        super(message);
    }
}
public class Ex3_3 {
    public static void checkrange(int number) throws OutofRangeException{
        if (number < 10 || number > 15){
            throw new OutofRangeException("The given number is out of range");
        }else{
            System.out.println(number*number);
        }
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = obj.nextInt();

        try {
            checkrange(num);
        } catch (OutofRangeException e) {
            System.out.println(e.getMessage());
        }
    }
}
