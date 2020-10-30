import java.util.Scanner;

public class RepeatString {
    static void method(String a , int b){
        for (int i = 0; i < b; i++) {
            System.out.print(a);
        }
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        method(scanner.nextLine(), scanner.nextInt());
    }
}
