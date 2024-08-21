package filereading_3;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class FileReading_3 {

    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>();
        readFile(employees);
        displayEmployees(employees);
        writeFile(employees);
    }

    static void displayEmployees(ArrayList<String> employees) {
        for (String employee : employees) {
            System.out.println(employee);
        }
    }

    public static void writeFile(ArrayList<String> employees) {
        Path path = Paths.get("C:\\Users\\hp\\Desktop\\JAVA\\File Reading\\userNames.txt");
        try (BufferedWriter bw = Files.newBufferedWriter(path, Charset.forName("ISO-8859-1"),
                StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
            for (String employee : employees) {
                bw.write(employee);
                bw.newLine();
            }
        } catch (IOException ioe) {
            System.out.println("Error writing file.");
            System.exit(0);
        }
    }
}
