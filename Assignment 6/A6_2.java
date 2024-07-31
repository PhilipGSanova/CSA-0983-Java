import java.util.Scanner;
public class A6_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for height and weight
        System.out.print("Enter your height in inches: ");
        float heightInInches = scanner.nextFloat();

        System.out.print("Enter your weight in pounds: ");
        float weightInPounds = scanner.nextFloat();

        // Calculate BMI
        float heightInMeters = heightInInches * 0.0254f;
        float weightInKilograms = weightInPounds * 0.453592f;
        float bmi = weightInKilograms / (heightInMeters * heightInMeters);

        // Print BMI value
        System.out.printf("Your BMI is: %.2f%n", bmi);

        // Determine BMI category and print appropriate message
        if (bmi <= 16.00) {
            System.out.println("BMI Category: Starvation");
        } else if (bmi >= 16.01 && bmi <= 16.99) {
            System.out.println("BMI Category: Emaciation");
        } else if (bmi >= 17.00 && bmi <= 18.49) {
            System.out.println("BMI Category: Underweight");
        } else if (bmi >= 18.50 && bmi <= 22.99) {
            System.out.println("BMI Category: Normal, low range");
        } else if (bmi >= 23.00 && bmi <= 24.99) {
            System.out.println("BMI Category: Normal, high range");
        } else if (bmi >= 25.00 && bmi <= 27.49) {
            System.out.println("BMI Category: Overweight, low range");
        } else if (bmi >= 27.50 && bmi <= 29.99) {
            System.out.println("BMI Category: Overweight, high range");
        } else if (bmi >= 30.00 && bmi <= 34.99) {
            System.out.println("BMI Category: 1st degree obesity");
        } else if (bmi >= 35.00 && bmi <= 39.99) {
            System.out.println("BMI Category: 2nd degree obesity");
        } else if (bmi >= 40.00) {
            System.out.println("BMI Category: 3rd degree obesity");
        }

        scanner.close();
    }
}
