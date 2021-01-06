import java.util.Scanner;

public class GodzillavsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.next());
        int statists = Integer.parseInt(scanner.next());
        double dressPricestatists = Double.parseDouble(scanner.next());
        double dekor = budget * 0.10;
        double moneyForStatists = statists * dressPricestatists;
        if (statists > 150){
            moneyForStatists = moneyForStatists - (moneyForStatists * 0.10);
        }
        double moneyToSpend = dekor + moneyForStatists;
        double diffMoney = budget - moneyToSpend;
        if(moneyToSpend <= budget ){
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.",Math.abs(diffMoney));
        }
        if(moneyToSpend > budget ){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.",Math.abs(diffMoney));
        }
    }
}
