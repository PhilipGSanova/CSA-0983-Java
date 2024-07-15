import java.util.Scanner;

public class SpecialCharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Given statement: ");
        String statement = scanner.nextLine();

        int specialCharCount = countSpecialCharacters(statement);
        System.out.println("Number of special characters: " + specialCharCount);
    }

    private static int countSpecialCharacters(String statement) {
        int count = 0;
        for (int i = 0; i < statement.length(); i++) {
            char ch = statement.charAt(i);
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                count++;
            }
        }
        return count;
    }
}
