import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int summ = 0;
        int times = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        for (int i = 1; i <= 100 ; i++) {
            if ( i % 2 != 0){
                summ += i;
                System.out.println(i);
                counter++;
            }
            if(counter==times){
                break;

            }
        }
        System.out.println("Sum: "+summ);
    }
}