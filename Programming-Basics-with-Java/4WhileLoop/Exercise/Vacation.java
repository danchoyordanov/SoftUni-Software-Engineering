import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double necessaryMoneyExcursion = Double.parseDouble(scanner.nextLine());
        double balance = Double.parseDouble(scanner.nextLine());
        int spendCounter = 0;
        int counter = 0;
        while (balance < necessaryMoneyExcursion){
            String movement = scanner.nextLine();
            counter++;
            double madeSum = Double.parseDouble(scanner.nextLine());
            switch (movement){
                case "spend":
                    balance = balance - madeSum;
                    break;
                case "save":
                    balance = balance + madeSum;
                    break;
            }
            if (balance <0 ){
                balance = 0;
            }
            if(movement.equals("spend")){
                spendCounter++;
                if(spendCounter==5){
                    System.out.printf("You can't save the money.%n%d",counter);
                    return;
                }
            }else {
                spendCounter=0;
            }

        }
        System.out.printf("You saved the money for %d days.",counter);
    }
}
