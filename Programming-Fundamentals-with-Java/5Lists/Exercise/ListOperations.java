import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+")).
                map(Integer::parseInt).collect(Collectors.toList());
        ;
        String[] operations = scanner.nextLine().split("\\s+");
        while (!(operations[0].equals("End"))) {
            switch (operations[0]) {
                case "Add":
                    list.add(Integer.parseInt(operations[1]));
                    break;
                case "Insert":
                    if (Integer.parseInt(operations[2]) < list.size() && Integer.parseInt(operations[2]) >= 0) {
                        list.add(Integer.parseInt(operations[2]), Integer.parseInt(operations[1]));
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    if (Integer.parseInt(operations[1]) < list.size() && Integer.parseInt(operations[1]) >= 0) {
                        list.remove(Integer.parseInt(operations[1]));
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    if (operations[1].equals("left")) {
                        for (int i = 0; i < Integer.parseInt(operations[2]); i++) {
                            int first = list.get(0);
                            list.remove(0);
                            list.add(first);
                        }
                    } else {
                        for (int i = 0; i < Integer.parseInt(operations[2]); i++) {
                            int last = list.get(list.size() - 1);
                            list.remove(list.size() - 1);
                            list.add(0, last);
                        }
                    }
            }
            operations = scanner.nextLine().split("\\s+");
        }
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }

    }

}