/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereading_4;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
/**
 *
 * @author hp
 */
public class FileReading_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FileSystem fs = FileSystems.getDefault();
        Path path = fs.getPath("C:/Users/hp/Desktop/JAVA/File Reading/employees.txt");
        System.out.println("Default Directory ["+path+"]");
    }
    
}
