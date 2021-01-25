import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nXm = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int[][] matrix = new int[nXm[0]][nXm[1]];

        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
        }
        int bestSum = Integer.MIN_VALUE;
        int[] bestVector = new int[2];

        for (int i = 0; i <matrix.length - 2 ; i++) {
            for (int j = 0; j < matrix[i].length - 2; j++) {
                int[] start = new int[] {i,j};
                if(findSum(start,matrix) > bestSum){
                    bestSum = findSum(start,matrix);
                    bestVector = start;
                }
            }
        }
        printMatrix(matrix,bestVector,bestSum);
    }

    private static void printMatrix(int[][] matrix, int[] bestVector,int bestSum) {
        System.out.println("Sum = " + bestSum);
        for (int row = bestVector[0]; row <= bestVector[0] + 2; row++) {
            for (int col = bestVector[1]; col <=bestVector[1] + 2 ; col++) {
                System.out.print(String.format("%d ",matrix[row][col]));
            }
            System.out.println();
        }
    }

    private static int findSum(int[] start, int[][] matrix) {
        int sum = 0;
        for (int row = start[0]; row <= start[0]+2; row++) {
            for (int col = start[1]; col <= start[1]+2; col++) {
                sum += matrix[row][col];
            }
        }
        return sum;
    }
}