import java.util.Scanner;

public class Orders {
    static void calcMethod(String product, double quantity){
        double sum;
        switch (product){
            case "coffee":
                sum = 1.50 * quantity;
                break;
            case "water":
                sum = 1.00 * quantity;
                break;
            case "coke":
                sum = 1.40 * quantity;
                break;
            case "snacks":
                sum = 2.00 * quantity;
                break;
            default:
                sum = 0;
        }

        System.out.printf("%.2f",sum);
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        calcMethod(scanner.nextLine(), Double.parseDouble(scanner.nextLine()));
    }
}
