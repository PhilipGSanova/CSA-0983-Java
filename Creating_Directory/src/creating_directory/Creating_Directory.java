package creating_directory;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Creating_Directory {

    public static void main(String[] args) {
        // Specify the path where the directory should be created
        String path = "C:\\Users\\hp\\Documents\\exampleDir"; // Change this path to your desired location
        // Specify the file name
        String fileName = "exampleFile.txt";

        // Create the directory
        File directory = new File(path);
        if (!directory.exists()) {
            if (directory.mkdirs()) { // Use mkdirs() to create any necessary parent directories
                System.out.println("Directory created: " + path);
            } else {
                System.out.println("Failed to create directory.");
                return;
            }
        } else {
            System.out.println("Directory already exists: " + path);
        }

        // Create the file within the directory
        File file = new File(path + File.separator + fileName);
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + fileName);

                // Write some content to the file
                FileWriter writer = new FileWriter(file);
                writer.write("Hello, this is a sample text.");
                writer.close();

                System.out.println("Content written to file: " + fileName);
            } else {
                System.out.println("File already exists: " + fileName);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }
}
