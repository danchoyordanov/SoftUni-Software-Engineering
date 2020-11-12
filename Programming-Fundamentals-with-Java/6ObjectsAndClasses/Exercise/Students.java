import java.awt.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Students {
    public static class Student {
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setSecondName(String secondName) {
            this.secondName = secondName;
        }

        public void setGrade(double grade) {
            this.grade = grade;
        }

        public Student(String firstName) {
            this.firstName = firstName;
        }

        String firstName;
        String secondName;
        double grade;

        public Student(String firstName, String secondName, double grade) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.grade = grade;
        }

        public double getGrade() {
            return grade;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getSecondName() {
            return secondName;
        }

        public String toString() {
            return String.format("%s %s: %.2f", firstName, secondName, grade);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split(" ");
            Student student = new Student(line[0], line[1], Double.parseDouble(line[2]));
            students.add(student);
        }
        students.stream().sorted((g1, g2) -> Double.compare(g2.getGrade(), g1.getGrade())).
                forEach(student -> System.out.println(student.toString()));

    }
}