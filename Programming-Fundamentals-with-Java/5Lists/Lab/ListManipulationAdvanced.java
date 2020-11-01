import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split(" ")).
                map(Integer::parseInt).collect(Collectors.toList());

        String[] input = scanner.nextLine().split(" ");

        while (!input[0].equals("end")) {
            switch (input[0]) {
                case "Contains":
                    int number = Integer.parseInt(input[1]);
                    if (list.contains(number)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    int i = 0;
                    if (input[1].equals("even")) {
                        while (i < list.size()) {
                            if (list.get(i) % 2 == 0) {
                                System.out.print(list.get(i) + " ");
                            }
                            i++;
                        }
                    } else if (input[1].equals("odd")) {
                        while (i < list.size()) {
                            if (list.get(i) % 2 != 0) {
                                System.out.print(list.get(i) + " ");
                            }
                            i++;
                        }
                    }
                    System.out.println();
                    break;
                case "Get":
                    if (input[1].equals("sum")) {
                        System.out.println(getSum(list));
                    }
                    break;
                case "Filter":
                    String condition = input[1];
                    int integer = Integer.parseInt(input[2]);
                    filet(list, condition, integer);
                    break;

            }
            input = scanner.nextLine().split(" ");
        }


    }

    static int getSum(List<Integer> list) {
        int sum = 0;
        int i = 0;
        while (i < list.size()) {
            sum += list.get(i++);
        }
        return sum;
    }

    static void filet(List<Integer> list, String condition, int integer) {
        int i = 0;
        switch (condition) {
            case "<":
                while (i < list.size()) {
                    if (list.get(i) < integer) {
                        System.out.print(list.get(i) + " ");
                    }
                    i++;
                }
                System.out.println();
                break;
            case ">":
                while (i < list.size()) {
                    if (list.get(i) > integer) {
                        System.out.print(list.get(i) + " ");
                    }
                    i++;
                }
                System.out.println();
                break;
            case ">=":
                while (i < list.size()) {
                    if (list.get(i) >= integer) {
                        System.out.print(list.get(i) + " ");
                    }
                    i++;
                }
                System.out.println();
                break;
            case "<=":
                while (i < list.size()) {
                    if (list.get(i) <= integer) {
                        System.out.print(list.get(i) + " ");
                    }
                    i++;
                }
                System.out.println();
                break;
        }
    }
}