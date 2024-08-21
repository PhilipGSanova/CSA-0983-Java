/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereading_2;

/**
 *
 * @author hp
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FileReading_2 {

    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>();
        readFile(employees);
        displayEmployees(employees);
    }

    static void displayEmployees(ArrayList<String> employees) {
        for (String employee : employees) {
            System.out.println(employee);
        }
    }

    static void readFile(ArrayList<String> employees) {
        String line;
        Path path = Paths.get("C:/Users/hp/Desktop/JAVA/FileReading2/employees.txt");

        try (BufferedReader fileInput = Files.newBufferedReader(path, Charset.forName("ISO-8859-1"))) {
            line = fileInput.readLine();
            while (line != null) {
                employees.add(line);
                line = fileInput.readLine();
            }
        } catch (IOException ioe) {
            System.out.println("Error reading file: " + ioe.getMessage());
        }
    }
}