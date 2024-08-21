package bufferwriterdemo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterDemo {

    public static void main(String[] args) {
        // Specify the file path where you want to write the content
        String filePath = "output.txt";

        try {
            // Create a BufferedWriter object using FileWriter
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));

            // Write some content to the file
            writer.write("This is an example of using BufferedWriter to write text to a file.");
            writer.newLine(); // Write a new line
            writer.write("BufferedWriter is used for efficient writing of characters.");
            writer.newLine();
            writer.write("It also supports writing multiple lines of text easily.");

            // Close the writer to flush and save the content
            writer.close();

            System.out.println("Content successfully written to " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
