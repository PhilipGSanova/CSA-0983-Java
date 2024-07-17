import java.util.Scanner;

public class CompositeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading inputs
        System.out.print("Enter the value of A: ");
        int A = scanner.nextInt();
        System.out.print("Enter the value of B: ");
        int B = scanner.nextInt();

        printCompositeNumbers(A, B);
    }

    public static void printCompositeNumbers(int A, int B) {
        // Ensure that the range is from the smaller number to the larger number
        int start = Math.min(A, B);
        int end = Math.max(A, B);

        boolean hasComposite = false;

        for (int i = start; i <= end; i++) {
            if (i > 1 && !isPrime(i)) {
                if (hasComposite) {
                    System.out.print(", ");
                }
                System.out.print(i);
                hasComposite = true;
            }
        }

        if (!hasComposite) {
            System.out.println("No composite numbers in the range.");
        } else {
            System.out.println();
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
