import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            int sumSaved = 0;
            double minimalBudget = Double.parseDouble(scanner.nextLine());
            while (sumSaved < minimalBudget) {
                double money = Double.parseDouble(scanner.nextLine());
                sumSaved += money;
            }
            if (sumSaved >= minimalBudget) {
                System.out.printf("Going to %s!%n", input);
            }
            input = scanner.nextLine();
        }
    }
}
