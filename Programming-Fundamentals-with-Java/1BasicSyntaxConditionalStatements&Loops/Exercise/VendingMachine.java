import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputMoney = scanner.nextLine();

        double nutsPrice = 2.0;
        double waterPrice = 0.7;
        double crispsPrice = 1.5;
        double sodaPrice = 0.8;
        double cokePrice = 1.0;

        double sumCoins = 0;

        while(!inputMoney.equals("Start")){
            double coins = Double.parseDouble(inputMoney);
            if(coins == 0.1||coins ==  0.2||coins ==  0.5||coins ==  1 ||coins ==  2){
                sumCoins += coins;
            }else{
                System.out.printf("Cannot accept %.2f%n",coins);
            }
            inputMoney = scanner.nextLine();
        }
        String inputProduct = scanner.nextLine();
        label:
        while(!inputProduct.equals("End")){
            String productName = "";
            boolean ok = false;
            switch (inputProduct) {
                case "Nuts":
                    if (sumCoins >= nutsPrice) {
                        ok = true;
                        sumCoins -= nutsPrice;
                        productName = "Nuts";
                    }
                    break;
                case "Water":
                    if (sumCoins >= waterPrice) {
                        ok = true;
                        sumCoins -= waterPrice;
                        productName = "Water";
                    }
                    break;
                case "Crisps":
                    if (sumCoins >= crispsPrice) {
                        ok = true;
                        sumCoins -= crispsPrice;
                        productName = "Crisps";
                    }
                    break;
                case "Soda":
                    if (sumCoins >= sodaPrice) {
                        ok = true;
                        sumCoins -= sodaPrice;
                        productName = "Soda";
                    }
                    break;
                case "Coke":
                    if (sumCoins >= cokePrice) {
                        ok = true;
                        sumCoins -= cokePrice;
                        productName = "Coke";
                    }
                    break;
                default:
                    if (!inputProduct.equals("Nuts") || !inputProduct.equals("Coke") || !inputProduct.equals("Soda") ||
                            !inputProduct.equals("Crisps") || !inputProduct.equals("Water")) {
                        System.out.println("Invalid product");
                        if (sumCoins < 0.70) {
                            break label;
                        }
                        inputProduct = scanner.nextLine();
                        continue;
                    }
                    break;
            }
            if (ok){
                System.out.printf("Purchased %s%n",productName);
            }else {
                System.out.println("Sorry, not enough money");
            }
            inputProduct = scanner.nextLine();
        }
        System.out.printf("Change: %.2f",sumCoins);
    }
}
