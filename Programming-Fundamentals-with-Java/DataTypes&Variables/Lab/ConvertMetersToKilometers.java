import java.util.Scanner;

public class ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        double print =  (double) input / 1000 ;
        System.out.printf("%.2f",print);
    }
}
