import java.util.Arrays;
import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        int n = Integer.parseInt(input[0]);
        String typeOfMethod = input[1];

        int[][] matrix = new int[n][n];
        if(typeOfMethod.equals("A")){
            methodA(matrix,n);
        }else if(typeOfMethod.equals("B")){
            methodB(matrix,n);
        }

        printMatrix(matrix);
    }

    private static int[][] methodB(int[][] matrix,int n) {
        int number = 1;
        for (int row = 0; row < matrix.length; row++) {
            if(row % 2 == 0){
                for (int col = 0; col < matrix[row].length; col++) {
                    matrix[col][row] = number++;
                }
            }else {
                for (int col = matrix[row].length-1; col >=0; col--) {
                    matrix[col][row] = number++;
                }
            }
        }
        return matrix;
    }

    private static int[][] methodA(int[][] matrix, int n) {
        int number =1;
        for (int row = 0; row < matrix.length; row++) {
            int currentNumber = number ;
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = currentNumber ;
                currentNumber +=n;
            }
            number++;
        }
        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]+ " ");
            }
            System.out.println();
        }
    }
}