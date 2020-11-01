import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    static String print(List<Double> numbers, String delimeter) {
        String output = "";
        for (Double item : numbers) {
            output += (new DecimalFormat("0.#").format(item) + delimeter);
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).
                collect(Collectors.toList());
        boolean searchAgain = true;
        while (searchAgain) {
            searchAgain = false;
            for (int i = 0; i < numbers.size() - 1; i++) {
                Double current = numbers.get(i);
                Double nextElement = numbers.get(i + 1);
                if (current.equals(nextElement)) {
                    numbers.remove(i);
                    numbers.set(i, current + nextElement);
                    searchAgain = true;
                    break;
                }
            }
        }
        System.out.println(print(numbers, " "));
    }
}


