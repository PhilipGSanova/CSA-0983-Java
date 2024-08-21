/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereading;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class FileReading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> employees = new ArrayList<>();
        readFile(employees);
        displayEmployees(employees);
    }
    static void displayEmployees(ArrayList<String> employees){
        for(String employee:employees)
            System.out.println(employee);
        
    }
    
    static void readFile(ArrayList<String> employees){
        String line = "";
        BufferedReader fileInput = null;
        
        try{
            fileInput = new BufferedReader(new FileReader(new File("C:/Users/hp/Desktop/JAVA/File Reading/employees.txt")));
            line = fileInput.readLine();
            while (line != null){
                employees.add(line);
                line = fileInput.readLine();
            }
            fileInput.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        catch(EOFException eofe){
            System.out.println("No more line to read.");
        }
        catch(IOException ioe){
            System.out.println("Error reading file.");
        }
    }
}