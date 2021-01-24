import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinaryConverter {
    public static void main(String[] args) {
        ArrayDeque<Integer> number = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        if(input == 0){
            System.out.println(0);
            return;
        }else{
            while (input != 0) {
                if(input%2==0){
                    number.push(0);
                }else{
                    number.push(1);
                }
                input/=2;
            }
        }
        for (Integer integer : number) {
            System.out.print(integer);
        }
    }
}
