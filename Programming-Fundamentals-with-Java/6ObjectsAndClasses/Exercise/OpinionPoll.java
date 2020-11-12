import java.awt.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class OpinionPoll {
    static class Person {
        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        String name;

        public String getName() {
            return name;
        }

        int age;

        public int getAge() {
            return age;
        }

        public Person() {

        }

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String toString() {
            return String.format("%s - %s", name, age);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Person> persons = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split(" ");
            Person person = new Person(line[0], Integer.parseInt(line[1]));
            persons.add(person);
        }
        persons.stream().filter(person -> person.getAge() > 30).sorted((p1, p2) -> p1.getName().compareTo(p2.getName())).
                forEach(person -> System.out.println(person.toString()));
    }
}