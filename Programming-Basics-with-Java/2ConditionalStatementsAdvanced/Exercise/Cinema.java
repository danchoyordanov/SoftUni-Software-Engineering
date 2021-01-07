import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        int r = Integer.parseInt(scanner.nextLine());
        double c = Double.parseDouble(scanner.nextLine());
        if (type.equals("Premiere")){
            System.out.printf("%.2f",(r*c*12));
        }else if (type.equals("Normal")){
            System.out.printf("%.2f",(r*c*7.5));
        }else if (type.equals("Discount")) {
            System.out.printf("%.2f", (r*c*5));
        }
    }
}
