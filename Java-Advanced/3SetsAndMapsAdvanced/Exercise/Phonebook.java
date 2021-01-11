import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("-");
        Map<String, String> dataPhone = new TreeMap<>();

        while (!input[0].equals("search")) {
            dataPhone.putIfAbsent(input[0], input[1]);
            dataPhone.put(input[0], input[1]);
            input = scanner.nextLine().split("-");
        }
        String name = scanner.nextLine();
        while (!name.equals("stop")) {
            if (dataPhone.containsKey(name)) {
                System.out.printf("%s -> %s%n", name, dataPhone.get(name));

            } else {
                System.out.printf("Contact %s does not exist.%n", name);
            }
            name = scanner.nextLine();
        }
    }
}
