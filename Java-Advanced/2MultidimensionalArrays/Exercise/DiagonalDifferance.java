import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifferance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[n][n];
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+")).
                    mapToInt(Integer::parseInt).toArray();
        }
        int row = 0, col =0 ;
        int sum1 = 0;
        int sum2 = 0;
        while (row<n && col<n){
            sum1 += matrix[row++][col++];
        }
        row = n-1;
        col = 0;
        System.out.println();
        while (row>=0 && col<n){
            sum2+=matrix[row--][col++];
        }
        if(sum1>sum2){
            System.out.println(sum1-sum2);
        }else{
            System.out.println(sum2-sum1);
        }

    }
}
