import java.util.Scanner;

public class RefactorSumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int counter= 0;
        for (int i = 0; i <= Integer.MAX_VALUE; i++) {
            if(i % 2 != 0 ){
                System.out.println(i);
                counter++;
                sum += i;
            }
            if(counter == n){
                break;
            }

        }
        System.out.printf("Sum: %d%n", sum);

    }
}
