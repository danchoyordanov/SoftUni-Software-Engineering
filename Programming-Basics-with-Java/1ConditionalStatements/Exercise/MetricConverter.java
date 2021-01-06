import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.next());
        String type = scanner.next();
        String secondType = scanner.next();
        if (type.equals("mm")){
            number = number / 1000;
        } else if (type.equals("cm")){
            number = number / 100;
        }
        if (secondType.equals("mm")){
            number = number * 1000;
        } else if (secondType.equals("cm")){
            number = number * 100;
        }
        System.out.printf("%.3f",number);
    }
}
