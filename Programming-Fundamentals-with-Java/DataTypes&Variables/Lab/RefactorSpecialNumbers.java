import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int sumALL = 0;

        for (int ch = 1; ch <= number; ch++) {
            sumALL = ch;
            while (ch > 0) {
                sum += ch % 10;
                ch = ch / 10;
            }
            if((sum == 5) || (sum == 7) || (sum == 11)){
                System.out.printf("%d -> True %n", sumALL);
            }else {
                System.out.printf("%d -> False %n", sumALL);
            }
            sum = 0;
            ch = sumALL;
        }

    }
}
