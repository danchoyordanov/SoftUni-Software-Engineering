import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nXm = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        String[][] matrix = new String[nXm[0]][nXm[1]];
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().split("\\s+");
        }
        String input = scanner.nextLine();
        while (!input.equals("END")){

            if (input.startsWith("swap")) {
                String[] data = input.split("\\s+");
                if (data.length > 5) {
                    System.out.println("Invalid input!");
                } else {

                    int row1 = Integer.parseInt(data[1]);
                    int col1 = Integer.parseInt(data[2]);
                    int row2 = Integer.parseInt(data[3]);
                    int col2 = Integer.parseInt(data[4]);

                    if (row1 > matrix.length || col1 > matrix[row1].length
                            || row2 > matrix.length || col2 > matrix[row2].length) {
                        System.out.println("Invalid input!");
                    } else {

                        String temp = matrix[row1][col1];
                        matrix[row1][col1] = matrix[row2][col2];
                        matrix[row2][col2] = temp;
                        printMatrix(matrix);
                    }
                }
            } else {
                System.out.println("Invalid input!");
            }
            input = scanner.nextLine();
        }
    }

    private static void slapElements(int row1, int col1, int row2, int col2,String[][] matrix) {
        if(isValid(row1,col1,matrix) && isValid(row2, col2,matrix)){
            String tempElement = matrix[row1][col1];
            matrix[row1][col1] = matrix[row2][col2];
            matrix[row2][col2] =  tempElement;
            printMatrix(matrix);
        }else{
            System.out.println("Invalid input!");
        }
    }

    private static void printMatrix(String[][] matrix) {
        for (String[] ints : matrix) {
            for (String element : ints) {
                System.out.print(element + " ");
            }
            System.out.println();

        }
    }

    private static boolean isValid(int row, int col, String[][] matrix) {

            if(row>=0 && row< matrix.length && col >= 0 && col < matrix[row].length ){
                return  true;
            }
            return  false;
    }


}
