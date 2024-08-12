import java.util.ArrayList;
import java.util.Collections;

public class Ex5_3 {
    public static void main(String[] args) {
        ArrayList <Integer> numbers = new ArrayList<>();
        for(int i=1; i<=10;i++){
            numbers.add(i);
        }
        Collections.reverse(numbers);
        System.out.println("Reversed ArrayList: "+numbers);
    }
}