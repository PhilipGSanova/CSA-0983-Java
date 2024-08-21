package filewriterdemo;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

    public static void main(String[] args) {
        // Specify the file path where you want to write the content
        String filePath = "output.txt";

        try {
            // Create a FileWriter object to write to the file
            FileWriter writer = new FileWriter(filePath);

            // Write some content to the file
            writer.write("This is an example of using FileWriter to write text to a file.\n");
            writer.write("FileWriter is part of java.io package.\n");
            writer.write("It writes text files in the default encoding.\n");

            // Close the writer to flush and save the content
            writer.close();

            System.out.println("Content successfully written to " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
