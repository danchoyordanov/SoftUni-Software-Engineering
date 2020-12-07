import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = ">>(?<furnitureName>[A-Za-z]+)<<(?<price>\\d+\\.?\\d+)!(?<quantity>\\d+)";
        Pattern pattern = Pattern.compile(regex);
        String inputConsole = scanner.nextLine();
        Matcher matcher = pattern.matcher(inputConsole);
        List<String> purchasedProducts = new ArrayList<>();

        double sum = 0;
        while (!inputConsole.equals("Purchase")) {
            matcher = pattern.matcher(inputConsole);
            if (matcher.find()) {
                String product = matcher.group("furnitureName");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                sum += price * quantity;
                purchasedProducts.add(product);
            }
            inputConsole = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        purchasedProducts.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f", sum);
    }
}
