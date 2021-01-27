import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMatrixRotation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int degrees = 0;
        String input = scanner.nextLine();
        String regex = "(?<=\\()\\d+(?=\\))";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            degrees = Integer.parseInt(matcher.group());
        }

        if (degrees >= 360) {
            degrees %= 360;
        }

        String line = scanner.nextLine();
        List<String> words = new ArrayList();
        int maxLength = 0;

        int rows;
        for(rows = 0; !line.equals("END"); line = scanner.nextLine()) {
            int currentLength = line.length();
            if (currentLength > maxLength) {
                maxLength = currentLength;
            }

            words.add(line);
            ++rows;
        }

        char[][] matrix = new char[rows][maxLength];

        int row;
        for(row = 0; row < words.size(); ++row) {
            StringBuilder word = new StringBuilder((String)words.get(row));

            while(word.length() < maxLength) {
                word.append(" ");
            }

            words.set(row, word.toString());
        }

        for(row = 0; row < rows; ++row) {
            matrix[row] = ((String)words.get(row)).toCharArray();
        }

        char[][] newMAtrix = rotateMatrix(matrix, degrees);
        printMatrix(newMAtrix);
    }

    private static char[][] rotateMatrix(char[][] matrix, int degrees) {
        char[][] newMatrix;
        int currentCol;
        int currRow;
        int rows;
        int cols;
        switch(degrees) {
            case 0:
                return matrix;
            case 90:
                newMatrix = new char[matrix[0].length][matrix.length];
                currentCol = 0;

                for(currRow = 0; currRow < newMatrix.length; ++currRow) {
                    for(rows = 0; rows < newMatrix[0].length; ++rows) {
                        newMatrix[currRow][rows] = matrix[matrix.length - 1 - rows][currentCol];
                    }

                    ++currentCol;
                }

                return newMatrix;
            case 180:
                newMatrix = new char[matrix.length][matrix[0].length];
                currRow = matrix.length - 1;

                for(rows = 0; rows < newMatrix.length; ++rows) {
                    for(cols = 0; cols < newMatrix[0].length; ++cols) {
                        newMatrix[rows][cols] = matrix[currRow][matrix[0].length - 1 - cols];
                    }

                    --currRow;
                }

                return newMatrix;
            case 270:
                newMatrix = new char[matrix[0].length][matrix.length];
                currentCol = matrix[0].length - 1;

                for(rows = 0; rows < newMatrix.length; ++rows) {
                    for(cols = 0; cols < newMatrix[0].length; ++cols) {
                        newMatrix[rows][cols] = matrix[cols][currentCol];
                    }

                    --currentCol;
                }

                return newMatrix;
            default:
                return matrix;
        }
    }

    private static void printMatrix(char[][] matrix) {
        char[][] var1 = matrix;
        int var2 = matrix.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            char[] row = var1[var3];

            for(int col = 0; col < matrix[0].length; ++col) {
                System.out.print(row[col]);
            }

            System.out.println();
        }

    }
}