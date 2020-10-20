import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] givenArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < givenArray.length; i++) {
            for (int j = i + 1; j < givenArray.length; j++) {
                if ((givenArray[i] + givenArray[j]) == sum) {
                    System.out.println(givenArray[i] + " " + givenArray[j]);
                }
            }
        }
    }
}
