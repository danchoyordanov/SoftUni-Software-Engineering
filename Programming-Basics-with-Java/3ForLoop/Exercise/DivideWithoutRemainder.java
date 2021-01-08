import java.util.Scanner;

public class DivideWithoutRemainder{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Integer.parseInt(scanner.nextLine());
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        double percent1 = 0;
        double percent2 = 0;
        double percent3 = 0;
        for (int i = 0; i < n; i++) {
            double number = Double.parseDouble(scanner.nextLine());
            if (number % 2 ==0 ){
                p1++;
                percent1 = p1 / n *  100;
            }
            if (number % 3 == 0){
                p2 ++;
                percent2 = p2 / n *  100;
            }
            if (number % 4 == 0){
                p3++;
                percent3 = p3 / n *  100;
            }
        }
        System.out.printf("%.2f%%%n",percent1);
        System.out.printf("%.2f%%%n",percent2);
        System.out.printf("%.2f%%",percent3);
    }
}
