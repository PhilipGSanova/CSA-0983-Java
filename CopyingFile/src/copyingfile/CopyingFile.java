/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copyingfile;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
/**
 *
 * @author hp
 */
public class CopyingFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create path variables
        Path p = Paths.get("C:/Users/hp/Desktop/JAVA");
        Path p1 = Paths.get("scores");
        Path p2 = Paths.get("backup");
        Path p3 = Paths.get("Highscores.txt");

        // create path for the working directory
        Path woD = p.resolve(p1);
        // create path for the working file
        Path woF = p.resolve(p1.resolve(p3));
        // create path for the backup directory
        Path buD = p.resolve(p2);
        // create path for the backup file
        Path buF = p.resolve(p2.resolve(p3));

        try {
            if (Files.exists(woF)) {
                if (Files.notExists(buD)) {
                    Files.createDirectories(buD);
                }
                Files.copy(woF, buF, StandardCopyOption.REPLACE_EXISTING,
                        StandardCopyOption.COPY_ATTRIBUTES);
            }
            if (Files.notExists(woD)) {
                Files.createDirectories(woD);
            }
            if (Files.notExists(woF)) {
                Files.createFile(woF);
            }
        } catch (IOException x) { // Corrected exception type and variable name
            System.err.println(x);
        }
    }
    
}
