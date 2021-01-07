import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String destination = "";
        String type = "";
        double moneySpend = 0;
        if (budget<=100){
            destination = "Bulgaria";
            switch (season){
                case "summer":
                    moneySpend = budget *0.30;
                    type = "Camp";
                    break;
                case "winter":
                    moneySpend = budget *0.70;
                    type = "Hotel";
                    break;
            }
        }else if (budget > 100 && budget <= 1000){
            destination = "Balkans";
            switch (season){
                case "summer":
                    moneySpend = budget *0.40;
                    type = "Camp";
                    break;
                case "winter":
                    moneySpend = budget *0.80;
                    type = "Hotel";
                    break;
            }
        }else if (budget >1000){
            destination = "Europe";
            switch (season){
                case "summer":
                    type = "Hotel";
                    moneySpend = budget *0.90;
                    break;
                case "winter":
                    moneySpend = budget *0.90;
                    type = "Hotel";
                    break;
            }
        }
        System.out.println("Somewhere in " +destination);
        System.out.printf("%s - %.2f",type,moneySpend);
    }
}
