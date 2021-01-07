import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();
        double sells = Double.parseDouble(scanner.nextLine());
        if (0 <= sells && sells <=500){
            switch (town){
                case "Sofia" :
                    System.out.printf("%.2f",(sells * 0.05));
                    break;
                case "Varna" :
                    System.out.printf("%.2f",(sells * 0.045));
                    break;
                case "Plovdiv" :
                    System.out.printf("%.2f",(sells * 0.055));
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        }else if (500 < sells && sells <= 1000 ){
            switch (town){
                case "Sofia" :
                    System.out.printf("%.2f",(sells * 0.07));
                    break;
                case "Varna" :
                    System.out.printf("%.2f",(sells * 0.075));
                    break;
                case "Plovdiv" :
                    System.out.printf("%.2f",(sells * 0.08));
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        }else if (1000 < sells && sells <= 10000 ){
            switch (town){
                case "Sofia" :
                    System.out.printf("%.2f",(sells * 0.08));
                    break;
                case "Varna" :
                    System.out.printf("%.2f",(sells * 0.10));
                    break;
                case "Plovdiv" :
                    System.out.printf("%.2f",(sells * 0.12));
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        }else if (sells >10000){
            switch (town){
                case "Sofia" :
                    System.out.printf("%.2f",(sells * 0.12));
                    break;
                case "Varna" :
                    System.out.printf("%.2f",(sells * 0.13));
                    break;
                case "Plovdiv" :
                    System.out.printf("%.2f",(sells * 0.145));
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        }else {
            System.out.println("error");
        }
    }
}


