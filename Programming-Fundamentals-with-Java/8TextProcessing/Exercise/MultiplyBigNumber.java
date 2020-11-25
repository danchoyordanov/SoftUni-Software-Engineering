import java.util.*;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstLine = scanner.nextLine().replaceFirst("^0+", "");
        int multiply = Integer.parseInt(scanner.nextLine());
        StringBuilder result = new StringBuilder();
        int numberLeft = 0;
        if (multiply == 0) {
            System.out.println(0);
            return;
        }
        for (int i = firstLine.length() - 1; i >= 0; i--) {
            int digit = Integer.parseInt(String.valueOf(firstLine.charAt(i)));
            int currentCalculation = (multiply * digit) + numberLeft;

            if (i == 0) {
                result.insert(0, currentCalculation);
            } else {
                int numberToAdd = currentCalculation % 10;
                result.insert(0, numberToAdd);
                numberLeft = currentCalculation / 10;
            }

        }
        System.out.println(result);
    }
}
