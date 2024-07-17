import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the marks in Python: ");
        double marksPython = getValidMarks(scanner);

        System.out.print("Enter the marks in C Programming: ");
        double marksCProgramming = getValidMarks(scanner);

        System.out.print("Enter the marks in Mathematics: ");
        double marksMathematics = getValidMarks(scanner);

        System.out.print("Enter the marks in Physics: ");
        double marksPhysics = getValidMarks(scanner);

        double total = marksPython + marksCProgramming + marksMathematics + marksPhysics;
        double aggregate = total / 4.0;

        System.out.println("Total = " + total);
        System.out.println("Aggregate = " + aggregate);

        if (aggregate > 75) {
            System.out.println("DISTINCTION");
        } else if (aggregate >= 60) {
            System.out.println("FIRST DIVISION");
        } else if (aggregate >= 50) {
            System.out.println("SECOND DIVISION");
        } else if (aggregate >= 40) {
            System.out.println("THIRD DIVISION");
        } else {
            System.out.println("FAIL");
        }
        scanner.close();
    }

    private static double getValidMarks(Scanner scanner) {
        double marks = scanner.nextDouble();
        while (marks < 0 || marks > 100) {
            System.out.print("Invalid input. Please enter marks between 0 and 100: ");
            marks = scanner.nextDouble();
        }
        return marks;
    }

}
