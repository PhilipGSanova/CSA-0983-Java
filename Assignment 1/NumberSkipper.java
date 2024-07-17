import java.util.Scanner;

public class NumberSkipper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading inputs
        System.out.print("Enter the value of M: ");
        int M = scanner.nextInt();
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();
        System.out.print("Enter the value of K: ");
        int K = scanner.nextInt();

        printSkippedNumbers(M, N, K);
    }

    public static void printSkippedNumbers(int M, int N, int K) {
        // Ensure K is non-zero to avoid infinite loop
        if (K == 0) {
            System.out.println("K cannot be zero.");
            return;
        }

        if ((M < N && K > 0) || (M > N && K < 0)) {
            for (int i = M; (K > 0 && i <= N) || (K < 0 && i >= N); i += (K + 1)) {
                System.out.print(i + (K > 0 && i + K + 1 <= N || K < 0 && i + K + 1 >= N ? ", " : ""));
            }
        } else {
            System.out.println("Invalid input: The combination of M, N, and K does not lead to a proper sequence.");
        }
        System.out.println();
    }
}
