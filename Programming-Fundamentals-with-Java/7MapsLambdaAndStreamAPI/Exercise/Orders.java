import java.util.*;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> orders = new LinkedHashMap<>();
        Map<String, Integer> keepProduct = new LinkedHashMap<>();
        String[] line = scanner.nextLine().split(" ");

        while (!line[0].equals("buy")) {
            orders.putIfAbsent(line[0], 0.00);
            keepProduct.putIfAbsent(line[0], 0);
            keepProduct.put(line[0], keepProduct.get(line[0]) + Integer.parseInt(line[2]));
            orders.put(line[0], keepProduct.get(line[0]) * Double.parseDouble(line[1]));


            line = scanner.nextLine().split(" ");
            if (line[0].equals("buy")) {

            }
        }

        orders.forEach((k, v) -> System.out.printf("%s -> %.2f%n", k, v));
    }
}
