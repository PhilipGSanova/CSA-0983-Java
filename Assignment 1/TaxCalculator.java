import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the income: ");
        double income = scanner.nextDouble();

        if (income < 0) {
            System.out.println("Income cannot be negative.");
        } else {
            double tax = calculateTax(income);
            System.out.println("Tax = " + tax);
        }
    }

    private static double calculateTax(double income) {
        double tax = 0;

        if (income <= 150000) {
            tax = 0;
        } else if (income <= 300000) {
            tax = (income - 150000) * 0.10;
        } else if (income <= 500000) {
            tax = (150000 * 0.10) + (income - 300000) * 0.20;
        } else {
            tax = (150000 * 0.10) + (200000 * 0.20) + (income - 500000) * 0.30;
        }

        return tax;
    }
}
