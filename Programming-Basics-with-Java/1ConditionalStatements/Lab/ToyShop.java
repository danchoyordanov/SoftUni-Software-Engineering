import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceExcursion = Double.parseDouble(scanner.nextLine());
        int pyzeli = Integer.parseInt(scanner.nextLine());
        int govoreshtikukli = Integer.parseInt(scanner.nextLine());
        int plushenomeche = Integer.parseInt(scanner.nextLine());
        int minion = Integer.parseInt(scanner.nextLine());
        int TIR = Integer.parseInt(scanner.nextLine());
        double pyzeliPrice = pyzeli * 2.60;
        double govoreshtikukliPrice = govoreshtikukli * 3 ;
        double plushenomechePrice = plushenomeche * 4.10;
        double minionPrice = minion * 8.20;
        double TIRPrice = TIR * 2;
        double sum = pyzeliPrice + plushenomechePrice + minionPrice + govoreshtikukliPrice + TIRPrice;
        int kolichestvo = pyzeli + govoreshtikukli + plushenomeche + minion + TIR;
        if (kolichestvo >= 50){
            double promoNamalenie25 = sum - (sum * 0.25);
            double krainaCenas10namalenie = promoNamalenie25 -(promoNamalenie25 * 0.10);
            double difference = krainaCenas10namalenie - priceExcursion;
            if (krainaCenas10namalenie >= priceExcursion){
                System.out.printf("Yes! %.2f lv left.",difference);
            }else if (krainaCenas10namalenie < priceExcursion){
                System.out.printf("Not enough money! %.2f lv needed.",Math.abs(difference));
            }
        } else {
            double krainacena10namalenie2 = sum - (sum * 0.10);
            double difference2 = krainacena10namalenie2 - priceExcursion;
            if (krainacena10namalenie2 >= priceExcursion){
                System.out.printf("Yes! %.2f lv left.",difference2);
            }else if (krainacena10namalenie2 < priceExcursion){
                System.out.printf("Not enough money! %.2f lv needed.",Math.abs(difference2));
            }
        }
    }
}
