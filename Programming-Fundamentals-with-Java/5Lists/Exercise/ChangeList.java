import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChangeList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split("\\s+");
        List<Integer> list = new ArrayList<>();
        for (String s : line) {
            list.add(Integer.parseInt(s));
        }
        String[] array = scanner.nextLine().split("\\s+");
        while (!array[0].equals("end")) {
            switch (array[0]) {
                case "Delete":
                    int element = Integer.parseInt(array[1]);
                    while (list.contains(element)) {
                        list.remove(Integer.valueOf(element));
                    }
                    break;
                case "Insert":
                    int elementt = Integer.parseInt(array[1]);
                    if (Integer.parseInt(array[2]) < list.size()) {
                        list.add(Integer.parseInt(array[2]), elementt);
                    }
                    break;
            }
            array = scanner.nextLine().split("\\s+");
        }

        for (Integer listOfWagon : list) {
            System.out.print(listOfWagon + " ");
        }

    }
}