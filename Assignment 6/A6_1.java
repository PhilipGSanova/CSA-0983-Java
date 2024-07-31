import java.util.Scanner;

public class A6_1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for three integers
        System.out.print("Enter 1st integer: ");
        int firstInt = scanner.nextInt();

        System.out.print("Enter 2nd integer: ");
        int secondInt = scanner.nextInt();

        System.out.print("Enter 3rd integer: ");
        int thirdInt = scanner.nextInt();

        // Compute the sum
        int sum = firstInt + secondInt + thirdInt;

        // Compute the product
        int product = firstInt * secondInt * thirdInt;

        // Compute the minimum
        int min = Math.min(firstInt, Math.min(secondInt, thirdInt));

        // Compute the maximum
        int max = Math.max(firstInt, Math.max(secondInt, thirdInt));

        // Print the results
        System.out.println("The sum is: " + sum);
        System.out.println("The product is: " + product);
        System.out.println("The min is: " + min);
        System.out.println("The max is: " + max);
        
        scanner.close();
    }
}