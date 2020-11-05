import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        //String[] line = scanner.nextLine().split("\\s+");
        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] array = scanner.nextLine().split("\\s+");
            if (array[2].equals("going!")) {
                if (list.contains(array[0])) {
                    System.out.printf("%s is already in the list!%n", array[0]);
                } else {
                    list.add(array[0]);
                }
            } else {
                if (list.contains(array[0])) {
                    list.remove(array[0]);
                } else {
                    System.out.printf("%s is not in the list!%n", array[0]);
                }
            }
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}
