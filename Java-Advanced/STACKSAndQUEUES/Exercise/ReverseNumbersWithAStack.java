import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> stackOfIntegers = new ArrayDeque<>();
        int[] nS = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        for (int n : nS) {
            stackOfIntegers.push(n);
        }
        for (Integer stackOfInteger : stackOfIntegers) {
            System.out.print(stackOfIntegers.pop()+ " ");
        }
    }
}
