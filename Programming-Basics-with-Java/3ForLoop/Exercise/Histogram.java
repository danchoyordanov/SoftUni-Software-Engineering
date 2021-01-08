import java.util.Scanner;

public class Histogram{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nn = Integer.parseInt(scanner.nextLine());
        double number1 = 0;
        double number2 = 0;
        double number3 = 0;
        double number4 = 0;
        double number5 = 0;
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;
        for (int i = 1 ; i <= nn; i++){
            int n = Integer.parseInt(scanner.nextLine());
            if (n < 200){
                number1 = number1 + 1;
                p1 =(number1 / nn) * 100;
            }else if (n < 400){
                number2 = number2 + 1;
                p2 = (number2 / nn) * 100;
            }else if (n >= 400 && n < 600){
                number3 = number3 + 1;
                p3 = (number3 / nn) * 100;
            }else if (n >= 600 && n < 800){
                number4 = number4 + 1;
                p4 = (number4 / nn) * 100;
            }else if (n >= 800){
                number5 = number5 + 1;
                p5 = (number5 / nn) * 100;
            }
        }

        System.out.printf("%.2f%%%n",p1);
        System.out.printf("%.2f%%%n",p2);
        System.out.printf("%.2f%%%n",p3);
        System.out.printf("%.2f%%%n",p4);
        System.out.printf("%.2f%%",p5);
    }
}
