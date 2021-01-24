import java.util.Scanner;

public class DivisibleBy3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int n = 3; n <= 100; n+=3) {
            System.out.println(n);
        }
    }
}
