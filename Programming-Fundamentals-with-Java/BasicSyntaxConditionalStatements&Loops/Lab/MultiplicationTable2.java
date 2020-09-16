import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int integer = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        if( n <=10){
            for (int i = n; i <= 10; i++) {
                int sum = integer * i;
                System.out.printf("%d X %d = %d%n", integer, i, sum);
            }
        }else {
            int sum = integer * n;
            System.out.printf("%d X %d = %d%n",integer,n,sum);
        }
    }
}
