import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "^%(?<name>[A-Z][a-z]+)%[^|$%.]*?<(?<product>\\w+)>[^|$%.]*?\\|(?<quantity>\\d+)\\|[^|$%.]*?(?<price>\\d+\\.?\\d+)\\$$";
        Pattern pattern = Pattern.compile(regex);
        String inputConsole = scanner.nextLine();

        double totalIncome = 0;
        while (!inputConsole.equals("end of shift")) {
            Matcher matcher = pattern.matcher(inputConsole);
            if (matcher.find()) {
                String name = matcher.group("name");
                String product = matcher.group("product");
                double totalPrice = Integer.parseInt(matcher.group("quantity")) * Double.parseDouble(matcher.group("price"));
                totalIncome += totalPrice;
                System.out.printf("%s: %s - %.2f%n", name, product, totalPrice);
            }
            inputConsole = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f", totalIncome);
    }
}
