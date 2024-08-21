package serialization;

import java.io.*;

public class Serialization implements java.io.Serializable {
    public String stu_Name;
    public String stu_Addr;
    public int stu_Id;

    public static void main(String[] args) {
        // Creating a student object
        Serialization std = new Serialization();
        std.stu_Name = "George";
        std.stu_Addr = "ABC,XYZ";
        std.stu_Id = 1;

        Serialization deserializedStudent = null;
        try {
            // Serializing the student object - std
            FileOutputStream fileOut = new FileOutputStream("C:\\Users\\hp\\Desktop\\JAVA\\Settings.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(std);
            out.close();
            fileOut.close();
            System.out.printf("Object serialized\n");

            // Deserialization process
            FileInputStream fileIn = new FileInputStream("C:\\Users\\hp\\Desktop\\JAVA\\Settings.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            // Deserialization
            deserializedStudent = (Serialization) in.readObject();
            in.close();
            fileIn.close();

            // Printing the deserialized object
            System.out.println("Deserialized Student...");
            System.out.println("Name: " + deserializedStudent.stu_Name);
            System.out.println("Address: " + deserializedStudent.stu_Addr);
            System.out.println("ID: " + deserializedStudent.stu_Id);
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
            e.printStackTrace();
        }
    }
}
