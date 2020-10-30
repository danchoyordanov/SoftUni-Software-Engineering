import java.util.Scanner;

public class CalculateRectangleArea {
    static void method(double a , double b){
        double sum;
        sum = a*b;
        System.out.printf("%.0f",sum);
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        method(Double.parseDouble(scanner.nextLine()), Double.parseDouble(scanner.nextLine()));
    }
}