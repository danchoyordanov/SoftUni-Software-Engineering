import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flower = scanner.nextLine();
        int numberOfFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double price = 0;
        if (flower.equals("Roses")){
            price = numberOfFlowers * 5;
            if (numberOfFlowers > 80) {
                price = price - (price * 0.10);
            }
        }else if (flower.equals("Dahlias")){
            price = numberOfFlowers * 3.80;
            if (numberOfFlowers > 90) {
                price = price - (price * 0.15);
            }
        }else if (flower.equals("Tulips")){
            price = numberOfFlowers * 2.80;
            if (numberOfFlowers > 80) {
                price = price - (price * 0.15);
            }
        }else if (flower.equals("Narcissus")){
            price = numberOfFlowers * 3;
            if (numberOfFlowers < 120) {
                price = price + (price * 0.15);
            }
        }else if (flower.equals("Gladiolus")){
            price = numberOfFlowers * 2.50;
            if (numberOfFlowers < 80) {
                price = price + (price * 0.20);
            }
        }
        double difference = budget - price ;
        if (price <= budget){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",numberOfFlowers,flower,
                    difference);
        }else if (price > budget){
            System.out.printf("Not enough money, you need %.2f leva more.",Math.abs(difference));
        }
    }
}
