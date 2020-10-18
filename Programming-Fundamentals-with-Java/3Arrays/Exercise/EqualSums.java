import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        if (array.length < 1) {
            System.out.println(0);
            return;
        }
        boolean isEquals = false;
        for (int i = 0; i < array.length; i++) {
            int leftSum = 0;
            int rightSum = 0;

            for (int j = i - 1; j >= 0; j--) {
                leftSum += array[j];
            }
            for (int j = i + 1; j < array.length; j++) {
                rightSum += array[j];
            }
            if (leftSum == rightSum) {
                isEquals = true;
                System.out.println(i);
                break;
            }
        }
        if (!isEquals) {
            System.out.println("no");
        }
    }
}
