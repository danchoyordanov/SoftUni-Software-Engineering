import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
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
            Student student = new Student();
            student.setFirstName(input[0]);
            student.setSecondName(input[1]);
            student.setAge(Integer.parseInt(input[2]));
            student.setCity(input[3]);
            students.add(student);
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
}