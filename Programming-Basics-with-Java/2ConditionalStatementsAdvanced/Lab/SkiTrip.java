import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String typeOfPlace = scanner.nextLine();
        String evaluation = scanner.next();
        double nights = days - 1;
        double price = 0;
        double totalPrice = 0;
        double positiveOrNegative = 0;
        double discounts = 0;
        if (days < 10 ){
            if (evaluation.equals("positive")) {
                switch (typeOfPlace) {
                    case "room for one person":
                        price = nights * 18;
                        discounts = price * 0.00;
                        totalPrice = price - discounts;
                        positiveOrNegative = totalPrice * 0.25;
                        totalPrice = totalPrice + positiveOrNegative;
                        System.out.printf("%.2f", totalPrice);
                        break;
                    case "apartment":
                        price = nights * 25;
                        discounts = price * 0.30;
                        totalPrice = price - discounts;
                        positiveOrNegative = totalPrice * 0.25;
                        totalPrice = totalPrice + positiveOrNegative;
                        System.out.printf("%.2f", totalPrice);
                        break;
                    case "president apartment":
                        price = nights * 35;
                        discounts = price * 0.10;
                        totalPrice = price - discounts;
                        positiveOrNegative = totalPrice * 0.25;
                        totalPrice = totalPrice + positiveOrNegative;
                        System.out.printf("%.2f", totalPrice);
                        break;
                }
            }else if (evaluation.equals("negative")) {
                switch (typeOfPlace) {
                    case "room for one person":
                        price = nights * 18;
                        discounts = price * 0.00;
                        totalPrice = price - discounts;
                        positiveOrNegative = totalPrice * 0.10;
                        totalPrice = totalPrice - positiveOrNegative;
                        System.out.printf("%.2f", totalPrice);
                        break;
                    case "apartment":
                        price = nights * 25;
                        discounts = price * 0.30;
                        totalPrice = price - discounts;
                        positiveOrNegative = totalPrice * 0.10;
                        totalPrice = totalPrice - positiveOrNegative;
                        System.out.printf("%.2f", totalPrice);
                        break;
                    case "president apartment":
                        price = nights * 35;
                        discounts = price * 0.10;
                        totalPrice = price - discounts;
                        positiveOrNegative = totalPrice * 0.10;
                        totalPrice = totalPrice - positiveOrNegative;
                        System.out.printf("%.2f", totalPrice);
                        break;
                }
            }
        }else if (10 <= days && days <=15){
            if (evaluation.equals("positive")) {
                switch (typeOfPlace) {
                    case "room for one person":
                        price = nights * 18;
                        discounts = price * 0.00;
                        totalPrice = price - discounts;
                        positiveOrNegative = totalPrice * 0.25;
                        totalPrice = totalPrice + positiveOrNegative;
                        System.out.printf("%.2f", totalPrice);
                        break;
                    case "apartment":
                        price = nights * 25;
                        discounts = price * 0.35;
                        totalPrice = price - discounts;
                        positiveOrNegative = totalPrice * 0.25;
                        totalPrice = totalPrice + positiveOrNegative;
                        System.out.printf("%.2f", totalPrice);
                        break;
                    case "president apartment":
                        price = nights * 35;
                        discounts = price * 0.15;
                        totalPrice = price - discounts;
                        positiveOrNegative = totalPrice * 0.25;
                        totalPrice = totalPrice + positiveOrNegative;
                        System.out.printf("%.2f", totalPrice);
                        break;
                }
            }else if (evaluation.equals("negative")) {
                switch (typeOfPlace) {
                    case "room for one person":
                        price = nights * 18;
                        discounts = price * 0.00;
                        totalPrice = price - discounts;
                        positiveOrNegative = totalPrice * 0.10;
                        totalPrice = totalPrice - positiveOrNegative;
                        System.out.printf("%.2f", totalPrice);
                        break;
                    case "apartment":
                        price = nights * 25;
                        discounts = price * 0.35;
                        totalPrice = price - discounts;
                        positiveOrNegative = totalPrice * 0.10;
                        totalPrice = totalPrice - positiveOrNegative;
                        System.out.printf("%.2f", totalPrice);
                        break;
                    case "president apartment":
                        price = nights * 35;
                        discounts = price * 0.15;
                        totalPrice = price - discounts;
                        positiveOrNegative = totalPrice * 0.10;
                        totalPrice = totalPrice - positiveOrNegative;
                        System.out.printf("%.2f", totalPrice);
                        break;
                }
            }
        }else if ( 15 < days) {
            if (evaluation.equals("positive")) {
                switch (typeOfPlace) {
                    case "room for one person":
                        price = nights * 18;
                        discounts = price * 0.00;
                        totalPrice = price - discounts;
                        positiveOrNegative = totalPrice * 0.25;
                        totalPrice = totalPrice + positiveOrNegative;
                        System.out.printf("%.2f", totalPrice);
                        break;
                    case "apartment":
                        price = nights * 25;
                        discounts = price * 0.50;
                        totalPrice = price - discounts;
                        positiveOrNegative = totalPrice * 0.25;
                        totalPrice = totalPrice + positiveOrNegative;
                        System.out.printf("%.2f", totalPrice);
                        break;
                    case "president apartment":
                        price = nights * 35;
                        discounts = price * 0.20;
                        totalPrice = price - discounts;
                        positiveOrNegative = totalPrice * 0.25;
                        totalPrice = totalPrice + positiveOrNegative;
                        System.out.printf("%.2f", totalPrice);
                        break;
                }
            }else if (evaluation.equals("negative")) {
                switch (typeOfPlace) {
                    case "room for one person":
                        price = nights * 18;
                        discounts = price * 0.00;
                        totalPrice = price - discounts;
                        positiveOrNegative = totalPrice * 0.10;
                        totalPrice = totalPrice - positiveOrNegative;
                        System.out.printf("%.2f", totalPrice);
                        break;
                    case "apartment":
                        price = nights * 25;
                        discounts = price * 0.50;
                        totalPrice = price - discounts;
                        positiveOrNegative = totalPrice * 0.10;
                        totalPrice = totalPrice - positiveOrNegative;
                        System.out.printf("%.2f", totalPrice);
                        break;
                    case "president apartment":
                        price = nights * 35;
                        discounts = price * 0.20;
                        totalPrice = price - discounts;
                        positiveOrNegative = totalPrice * 0.10;
                        totalPrice = totalPrice - positiveOrNegative;
                        System.out.printf("%.2f", totalPrice);
                        break;
                }
            }
        }
    }
}

