import java.util.Scanner;
import java.util.Arrays;


public class CondenseArraytoNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] originalArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        if (originalArray.length < 2){
            System.out.println(originalArray[0]);
            return ;
        }
        int finalResult = 0;
        int firstLength = originalArray.length - 1;
        for (int i = 0; i < firstLength; i++) {
            int[] modifiedArray = new int[originalArray.length - 1];
            for (int j = 0; j < modifiedArray.length; j++) {
                modifiedArray[j] = originalArray[j] + originalArray[j + 1];
            }
            originalArray = modifiedArray;
            finalResult = modifiedArray[0];

        }
        System.out.println(finalResult);
    }
}