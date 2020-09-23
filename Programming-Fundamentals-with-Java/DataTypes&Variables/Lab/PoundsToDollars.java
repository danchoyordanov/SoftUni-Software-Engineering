import java.util.Scanner;

public class PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double input = scanner.nextDouble();
        double dollars = input * 1.31 ;
        System.out.printf("%.3f", dollars);
    }
}
