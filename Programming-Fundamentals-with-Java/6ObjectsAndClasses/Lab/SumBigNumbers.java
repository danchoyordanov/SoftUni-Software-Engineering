import java.math.BigInteger;
        import java.util.ArrayList;
        import java.util.List;
        import java.util.Random;
        import java.util.Scanner;

public class SumBigNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger firstNumber = new BigInteger(scanner.nextLine());
        BigInteger secondNumber = new BigInteger(scanner.nextLine());
        BigInteger sum = firstNumber.add(secondNumber);
        System.out.println(sum);

    }
}
