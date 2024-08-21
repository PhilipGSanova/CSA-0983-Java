package writerdemo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterDemo {

    public static void main(String[] args) {
        // Specify the file path where you want to write the content
        String filePath = "output.txt";

        try {
            // Create a Writer object using FileWriter
            Writer writer = new FileWriter(filePath);

            // Write some content to the file
            writer.write("This is an example of using Writer to write text to a file.\n");
            writer.write("FileWriter is used as the concrete implementation.\n");
            writer.write("This allows writing characters to a file easily.\n");

            // Close the writer to flush and save the content
            writer.close();

            System.out.println("Content successfully written to " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
