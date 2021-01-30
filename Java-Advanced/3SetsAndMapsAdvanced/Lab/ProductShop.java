import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputData = scanner.nextLine().split(", ");
        Map<String,Map<String,Double>> data = new TreeMap<>();
        while (!inputData[0].equals("Revision")){
            String shop = inputData[0];
            String product = inputData[1];
            double price = Double.parseDouble(inputData[2]);
            data.putIfAbsent(shop,new LinkedHashMap<>());
            data.get(shop).put(product,price);

            inputData = scanner.nextLine().split(", ");
        }
        data.forEach((k,v) -> {
            System.out.println(k + "->");
            v
                    .forEach((kk,vv) -> {
                        System.out.printf("Product: %s, Price: %.1f%n",kk,vv);
                    });
        } );
    }
}
