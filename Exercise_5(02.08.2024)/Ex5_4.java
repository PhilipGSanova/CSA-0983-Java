import java.util.ArrayList;

public class Ex5_4 {
    public static void main(String[] args) {
        ArrayList <Integer> numbers = new ArrayList<>();
        numbers.add(43);
        numbers.add(76);
        numbers.add(23);
        numbers.add(93);
        numbers.add(48);
        numbers.add(15);
        numbers.add(83);

        System.out.println("Original ArrayList: "+numbers);

        numbers.set(1,7);

        System.out.println("Updated ArrayList: "+numbers);
    }
}
