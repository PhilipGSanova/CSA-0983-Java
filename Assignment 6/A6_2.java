import java.util.ArrayList;
import java.util.List;

public class A6_2 {
    private int student_id;
    private String student_name;
    private List<Integer> grades;

    public A6_2(int student_id, String student_name) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.grades = new ArrayList<>();
    }

    public int getStudentId() {
        return student_id;
    }

    public void setStudentId(int student_id) {
        this.student_id = student_id;
    }

    public String getStudentName() {
        return student_name;
    }

    public void setStudentName(String student_name) {
        this.student_name = student_name;
    }

    public void addGrade(int grade) throws IllegalArgumentException {
        if (grade < 0 || grade > 100) {
            throw new IllegalArgumentException("Grade must be between 0 and 100.");
        }
        grades.add(grade);
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public static void main(String[] args) {
        try {
            A6_2 student = new A6_2(1, "John Doe");

            student.setStudentId(1);
            student.setStudentName("John Doe");

            student.addGrade(85);
            student.addGrade(92);

            student.addGrade(110); 

            System.out.println("Student ID: " + student.getStudentId());
            System.out.println("Student Name: " + student.getStudentName());
            System.out.println("Grades: " + student.getGrades());

        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
