import java.text.DecimalFormat;
import java.util.Scanner;

public class MatOperations {
    static double calculator(int a, String operator, int b) {
        double result = 0.0;
        switch (operator) {
            case "/":
                result = (double) a / b;
                break;
            case "*":
                result = a * b;
                break;
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            default:

        }
        return result;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(new DecimalFormat("0.####").
                format(calculator(Integer.parseInt(scanner.nextLine()), scanner.nextLine(), scanner.nextInt())));

    }
}
