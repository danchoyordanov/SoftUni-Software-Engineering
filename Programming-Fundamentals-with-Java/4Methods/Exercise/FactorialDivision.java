import java.util.Scanner;

public class FactorialDivision {
    public static long factorialCalculator(int a) {
        long factorial = 1;
        for (int i = 1; i <= a; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        double result = (double) factorialCalculator(firstNumber) / factorialCalculator(secondNumber);
        System.out.printf("%.2f", result);
    }

}

