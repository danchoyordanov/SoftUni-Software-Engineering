import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> first = Arrays.stream(scanner.nextLine().split(" ")).
                map(Integer::parseInt).collect(Collectors.toList());
        String[] input = scanner.nextLine().split(" ");
        String command = input[0];
        while (!command.equals("end")) {
            switch (command) {
                case "Add":
                    int numberToAdd = Integer.parseInt(input[1]);
                    first.add(numberToAdd);
                    break;
                case "Remove":
                    Integer numberToRemove = Integer.parseInt(input[1]);
                    first.remove(numberToRemove);
                    break;
                case "RemoveAt":
                    int index = Integer.parseInt(input[1]);
                    first.remove(index);
                    break;
                case "Insert":
                    int numberToADD = Integer.parseInt(input[1]);
                    int indexX = Integer.parseInt(input[2]);
                    first.add(indexX, numberToADD);
                    break;
            }
            input = scanner.nextLine().split(" ");
            command = input[0];
        }
        System.out.println(first.toString().replaceAll("[\\[\\],]", ""));
    }
}