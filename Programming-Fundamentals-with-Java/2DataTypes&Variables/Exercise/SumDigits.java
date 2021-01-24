import java.util.Scanner;


public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        do {
            sum = sum + (number % 10);
            number = number / 10;
        }while(number >0);

        System.out.println(sum);
    }
}
