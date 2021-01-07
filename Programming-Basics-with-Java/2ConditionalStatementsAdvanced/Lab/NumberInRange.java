import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        if (number >=-100 && number<=100 ){
            if (number == 0 ){
                System.out.println("No");
            }else {
                System.out.println("Yes");
            }
        }else {
            System.out.println("No");
        }
    }
}
