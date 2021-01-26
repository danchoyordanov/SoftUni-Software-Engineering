import java.util.Arrays;
import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int r = input[0];
        int c = input[1];
        String[][] matrix = new String[r][c];
        for (int row = 0; row < r; row++) {
            for (int col = 0; col < matrix[row].length ; col++) {
                matrix[row][col] = String.format("%c%c%c",(97+row),(97+col+row),(97+row));
            }
        }
        printMatrix(matrix);
    }

    private static void printMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]+ " ");
            }
            System.out.println();
        }
    }
}
