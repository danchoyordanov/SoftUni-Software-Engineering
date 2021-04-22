import java.util.Scanner;


public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split(" ");
            count++;
            if (count % 2 == 0) {
                arr1[i] = Integer.parseInt(line[0]);
                arr2[i] = Integer.parseInt(line[1]);
            } else {
                arr1[i] = Integer.parseInt(line[1]);
                arr2[i] = Integer.parseInt(line[0]);
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

    }
}