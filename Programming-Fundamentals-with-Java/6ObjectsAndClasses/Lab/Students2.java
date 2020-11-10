import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students2 {
    static class Student {
        String firstName;

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getFirstName() {
            return firstName;
        }

        String secondName;

        public void setSecondName(String secondName) {
            this.secondName = secondName;
        }

        public String getSecondName() {
            return secondName;
        }

        int age;

        public void setAge(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public Student(String firstName, String secondName, int age, String city) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.age = age;
            this.city = city;
        }

        String city;

        public void setCity(String city) {
            this.city = city;
        }

        public String getCity() {
            return city;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        String[] input = scanner.nextLine().split("\\s+");
        while (!input[0].equals("end")) {
            Student student = new Student(input[0], input[1], Integer.parseInt(input[2]), input[3]);

            int existingIndex = findStudentIndex(students, student.getFirstName(), student.getSecondName());
            if (existingIndex != -1) {
                students.get(existingIndex).setCity(student.city);
                students.get(existingIndex).setAge(student.age);
            } else {
                students.add(student);
            }
            input = scanner.nextLine().split("\\s+");
        }
        String cityToCheckFor = scanner.nextLine();
        for (Student student : students) {
            if (student.getCity().equals(cityToCheckFor)) {
                System.out.printf("%s %s is %d years old%n", student.getFirstName(), student.getSecondName(),
                        student.getAge());
            }
        }

    }

    static int findStudentIndex(List<Student> students, String FirstName, String LastName) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getFirstName().equals(FirstName) && students.get(i).getSecondName().equals(LastName)) {
                return i;
            }
        }
        return -1;
    }
}