import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[size][size];

        for (int row = 0; row < size; row++) {
            matrix[row]= Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }

        int row = 0, col =0 ;

        while (row<size && col<size){
            System.out.print(matrix[row++][col++]+ " ");
        }
        row = size-1;
        col = 0;
        System.out.println();
        while (row>=0 && col<size){
            System.out.print(matrix[row--][col++]+ " ");
        }

    }
}
