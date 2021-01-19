import  java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;
            if ( max < number){
                max = number;
            }
        }
        int sumWithoutMaxNumber = sum - max;
        if ( max == sumWithoutMaxNumber){
            System.out.println("Yes");
            System.out.println("Sum = "+ max);
        }else {
            System.out.println("No");
            System.out.println("Diff = " + (Math.abs(max-sumWithoutMaxNumber)));
        }
    }
}
