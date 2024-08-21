/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereading_6;

import java.net.URI;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author hp
 */
public class FileReading_6 {

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
        
        System.out.println(paths[0].getFileName());
        System.out.println(paths[0].getParent());
        System.out.println(paths[0].getNameCount());
        System.out.println(paths[0].isAbsolute());
        System.out.println(paths[3].toAbsolutePath());
        System.out.println(paths[0].toUri());
    }
    
}
