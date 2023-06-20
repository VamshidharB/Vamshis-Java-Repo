import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student {
    private String firstName;
    private String lastName;
    private double gpa;

    public Student(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}

public class RemoveStudentsBelowAverageGPA {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Ram", "ji", 3.5));
        studentList.add(new Student("Sita", "ji", 4.0));
        studentList.add(new Student("Pavan", "ji", 2.8));
        studentList.add(new Student("Lakshman", "bro", 3.2));
        studentList.add(new Student("Bharath", "ji", 3.7));

        // Calculate the average GPA
        double totalGpa = 0.0;
        for (Student student : studentList) {
            totalGpa += student.getGpa();
        }
        double averageGpa = totalGpa / studentList.size();

        // Remove students with GPA below the average
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getGpa() < averageGpa) {
                iterator.remove();
            }
        }

        // Print the remaining students
        System.out.println("Remaining students:");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
