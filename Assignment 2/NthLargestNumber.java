import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NthLargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {14, 67, 48, 23, 5, 62};

        System.out.print("Enter N: ");
        try {
            int N = scanner.nextInt();
            if (N <= 0) {
                System.out.println("Please enter a positive integer greater than 0.");
            } else if (N > array.length) {
                System.out.println("N is larger than the array size.");
            } else {
                int nthLargest = findNthLargest(array, N);
                System.out.println(N + "th largest number: " + nthLargest);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }

    private static int findNthLargest(int[] array, int N) {
        Arrays.sort(array);
        return array[array.length - N];
    }
}
