import java.util.Scanner;

public class MultiplyEvensbyOdds {


    static void getMultipleOfEvensAndOdds(int number) {
        number = Math.abs(number);
        int evenSum = 0;
        int oddSum = 0;
        while (number > 0) {
            if ((number % 10) % 2 == 0) {
                evenSum += number % 10;
            } else {
                oddSum += number % 10;
            }
            number = number / 10;

        }
        int bothSum = evenSum * oddSum;
        System.out.println(bothSum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        getMultipleOfEvensAndOdds(scanner.nextInt());
    }
}
