import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] massive = new int[n];
        for (int i = 0; i < massive.length; i++) {
            massive[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < massive.length; i++) {
            System.out.print(massive[i] + " ");
            sum += massive[i];
        }
        System.out.println();
        System.out.println(sum);
    }
}