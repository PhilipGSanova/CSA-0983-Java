import java.util.Random;
public class A6_3 {
    public static void main(String[] args) {
        Random random = new Random();
        int count = 0;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        while (count < 10) {
            int number = random.nextInt(100) + 1; // Generates a random number between 1 and 100
            System.out.println("Randomly drawn number: " + number);

            if (number > largest) {
                largest = number;
            }

            if (number < smallest) {
                smallest = number;
            }

            count++;
        }

        System.out.println("The largest number is: " + largest);
        System.out.println("The smallest number is: " + smallest);
    }
}
