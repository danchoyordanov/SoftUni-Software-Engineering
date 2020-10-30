import java.util.Scanner;

public class PrintingTriangle {

    static void printSign(int number){
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    static void printBack(int number){
        for (int i = number - 1; i >= 1  ; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n = scanner.nextInt();
        printSign(n);
        printBack(n);
    }
}
