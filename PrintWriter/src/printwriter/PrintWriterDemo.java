package printwriter;

import java.io.*;

public class PrintWriterDemo {

    public static void main(String[] args) {
        // Specify the file path where you want to write the content
        String filePath = "output.txt";

        try {
            // Create a PrintWriterDemo object to write to the file
            PrintWriter writer = new PrintWriter(new FileWriter(filePath));

            // Write some content to the file
            writer.println("Hello, World!");
            writer.println("This is a sample text written using PrintWriter.");
            writer.println("Writing multiple lines is easy with PrintWriter.");

            // Close the writer to flush and save the content
            writer.close();

            System.out.println("Content successfully written to " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
