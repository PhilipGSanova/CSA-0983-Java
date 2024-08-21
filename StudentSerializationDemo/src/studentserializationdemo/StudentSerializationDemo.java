package studentserializationdemo;

import java.io.*;

class StudentInformation implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private int age;
    private double marks;

    public StudentInformation(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student Marks: " + marks);
    }
}

public class StudentSerializationDemo {

    public static void main(String[] args) {
        // Create a student object
        StudentInformation student = new StudentInformation("John", 20, 85.34);

        // Serialize the student object to a file
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("StudentSerializationDemo.txt"))) {
            out.writeObject(student);
            System.out.println("Student Information serialized.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the student object from the file
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("StudentSerializationDemo.txt"))) {
            StudentInformation deserializedStudent = (StudentInformation) in.readObject();
            System.out.println("\nStudent Information deserialized");
            deserializedStudent.displayInfo();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
