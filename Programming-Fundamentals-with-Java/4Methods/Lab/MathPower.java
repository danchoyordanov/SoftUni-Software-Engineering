import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {

    static void mathPower(double a, int b) {
        double sumOfPow = Math.pow(a, b);
        System.out.println(new DecimalFormat("0.####").format(sumOfPow));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        mathPower(Double.parseDouble(scanner.nextLine()), Integer.parseInt(scanner.nextLine()));
    }
}