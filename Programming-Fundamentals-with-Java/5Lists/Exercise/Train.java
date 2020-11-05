import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Train {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(" ");
        List<Integer> listOfWagons = new ArrayList<>();
        for (String s : line) {
            listOfWagons.add(Integer.parseInt(s));
        }
        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String[] input = scanner.nextLine().split(" ");

        while (!input[0].equals("end")) {
            if ("Add".equals(input[0])) {
                int numberOfPeople = Integer.parseInt(input[1]);
                listOfWagons.add(numberOfPeople);
            } else {
                int i = 0;
                while (i < listOfWagons.size()) {
                    if (Integer.parseInt(input[0]) + listOfWagons.get(i) <= maxCapacity) {
                        listOfWagons.set(i, Integer.parseInt(input[0]) + listOfWagons.get(i));
                        break;
                    }
                    i++;
                }
            }
            input = scanner.nextLine().split(" ");
        }
        for (Integer listOfWagon : listOfWagons) {
            System.out.print(listOfWagon + " ");
        }

    }
}