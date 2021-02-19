import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class examOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //queue
        ArrayDeque<Integer> firstMagicBox = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toCollection(ArrayDeque::new));

        //stack

        ArrayDeque<Integer> secondMagicBox = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(secondMagicBox::push);

        int collectionSum = 0;

        while (!firstMagicBox.isEmpty() && !secondMagicBox.isEmpty()) {
            int currentFirstBox = firstMagicBox.peek();
            int currentSecondBox = secondMagicBox.peek();
            int sum = 0;
            sum = currentFirstBox + currentSecondBox;
            if (sumIsEven(sum)) {
                collectionSum += sum;
                firstMagicBox.poll();
                secondMagicBox.pop();
            } else {

                firstMagicBox.offer(currentSecondBox);
                secondMagicBox.pop();
            }
            if (firstMagicBox.isEmpty()) {
                System.out.println("First magic box is empty.");
                break;
            } else if (secondMagicBox.isEmpty()) {
                System.out.println("Second magic box is empty.");
            }
        }
        if (collectionSum >= 90) {
            System.out.println("Wow, your prey was epic! Value: " + collectionSum);
        } else {
            System.out.println("Poor prey... Value: " + collectionSum);
        }
    }

    private static boolean sumIsEven(int sum) {
        return sum % 2 == 0;
    }
}
