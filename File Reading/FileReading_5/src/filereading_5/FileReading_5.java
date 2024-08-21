/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereading_5;
import java.net.URI;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
/**
 *
 * @author hp
 */
public class FileReading_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Path[] paths = new Path[5];
        paths[0] = Paths.get("C:\\Users\\hp\\Desktop\\JAVA\\File Reading\\employees.txt");
        paths[1] = Paths.get("C:/Users/hp/Desktop/JAVA/File Reading/employees.txt");
        paths[2] = Paths.get("C:","Users","hp","Desktop","JAVA","File Reading","employees.txt");
        paths[3] = Paths.get("employees.txt");
        paths[4] = Paths.get(URI.create("file:///~/employees.txt"));
        
        for(int i = 0; i < paths.length; i++){
            System.out.println("Default File Path p["+i+"] -"+paths[i]);
        }
    }
    
}
