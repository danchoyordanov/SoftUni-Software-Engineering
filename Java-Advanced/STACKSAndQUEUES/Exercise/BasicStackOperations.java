import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = scanner.nextInt();
        int y = scanner.nextInt();
        int[] Array = new int[n];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = scanner.nextInt();
        }
        ArrayDeque<Integer> numbers = new ArrayDeque<>();
        for (int i : Array) {
            numbers.push(i);
        }
        for (int i = 0; i < s; i++) {
            numbers.pop();
        }
        if (numbers.isEmpty()) {
            System.out.println(0);
            return;
        }
        boolean isFound = false;
        int smallestNumber = Integer.MAX_VALUE;
        for (Integer number : numbers) {
            if(number==y){
                isFound = true;
                System.out.println(isFound);
                return;
            }else{
                if(smallestNumber>number){
                    smallestNumber=number;
                }
            }
        }
        System.out.println(smallestNumber);
    }
}