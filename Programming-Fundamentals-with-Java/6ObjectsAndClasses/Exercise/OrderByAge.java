import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderByAge {
    public static class PersonInformation {
        String name;
        String id;
        int age;

        public PersonInformation(String name, String id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String ToString() {
            return String.format("%s with ID: %s is %d years old.", name, id, age);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<PersonInformation> personInformationList = new ArrayList<>();
        String[] input = scanner.nextLine().split(" ");
        while (!input[0].equals("End")) {
            PersonInformation person = new PersonInformation(input[0], input[1], Integer.parseInt(input[2]));
            personInformationList.add(person);
            input = scanner.nextLine().split(" ");
        }
        personInformationList.stream().sorted((age1, age2) -> Integer.compare(age1.getAge(), age2.getAge())).
                forEach(personInformation -> System.out.println(personInformation.ToString()));
    }
}

