import java.util.Scanner;

public class PerfectNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N: ");
        double input = scanner.nextDouble();
        int N = (int) input;

        if (N <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            printFirstNPerfectNumbers(N);
        }
    }

    private static void printFirstNPerfectNumbers(int N) {
        int count = 0;
        int num = 1;

        System.out.print("First " + N + " perfect numbers are: ");

        while (count < N) {
            if (isPerfect(num)) {
                System.out.print(num);
                count++;
                if (count < N) {
                    System.out.print(", ");
                }
            }
            num++;
        }

        System.out.println();
    }

    private static boolean isPerfect(int num) {
        int sum = 1; 

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num && num != 1;
    }
}
