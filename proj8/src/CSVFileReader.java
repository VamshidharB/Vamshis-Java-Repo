import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    private String firstName;
    private String lastName;
    private double gpa;

    public Student(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public int compareTo(Student other) {
        return this.lastName.compareTo(other.lastName);
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

public class CSVFileReader {
    public static void main(String[] args) {
        String csvFilePath = "E:\\test project\\Vamshis-Java-Repo\\proj8\\src\\students.csv";

        List<Student> students = readCSVFile(csvFilePath);
        if (students != null) {
            System.out.println("Before sorting:");
            printStudents(students);

            Collections.sort(students);

            System.out.println("\nAfter sorting by last name:");
            printStudents(students);
        }
    }

    private static List<Student> readCSVFile(String filePath) {
        List<Student> students = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 3) {
                    String firstName = data[0].trim();
                    String lastName = data[1].trim();
                    double gpa = Double.parseDouble(data[2].trim());

                    Student student = new Student(firstName, lastName, gpa);
                    students.add(student);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return students;
    }

    private static void printStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
