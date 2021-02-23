import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int r = 1; r <= n; r++) {
            for (int j = 0; j < n - r; j++) {
                System.out.print(" ");
            }
            for (int s = 0; s < r; s++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int r = 1; r <= n -1 ; r++) {
            for (int s = 0; s < r; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - r; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
