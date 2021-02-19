import java.util.Scanner;

public class examTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //        •	+ – regular position on the field.
        //•	e – end of the route.
        //•	B – bomb
        //•	s – the place where the sapper starts

        //•	Field size – an integer number.
        //•	Commands to move the sapper – an array of strings separated by ",".
        //•	The field: some of the following characters (+, e, B, s), separated by whitespace (" ");

        int n = Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[n][n];

        String[] commandsForSapper = scanner.nextLine().split(",");
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().replace(" ", "").toCharArray();
        }
        int[] startLocation = new int[2];
        int bombCounter = 0;
        int allBombs = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 's') {
                    startLocation[0] = i;
                    startLocation[1] = j;
                }
                if (matrix[i][j] == 'B') {
                    allBombs++;
                }
            }
        }
        int row = startLocation[0];
        int col = startLocation[1];

        for (int i = 0; i < commandsForSapper.length; i++) {

            switch (commandsForSapper[i]) {
                case "left":
                    if (isInBounds(matrix, row, col - 1)) {
                        col = col - 1;
                        if (matrix[row][col] == 'B') {
                            System.out.println("You found a bomb!");
                            bombCounter++;
                            matrix[row][col] = '+';
                        }
                    }
                    break;
                case "right":
                    if (isInBounds(matrix, row, col + 1)) {
                        col = col + 1;
                        if (matrix[row][col] == 'B') {
                            System.out.println("You found a bomb!");
                            bombCounter++;
                            matrix[row][col] = '+';
                        }
                    }
                    break;
                case "up":
                    if (isInBounds(matrix, row - 1, col)) {
                        row = row - 1;
                        if (matrix[row][col] == 'B') {
                            System.out.println("You found a bomb!");
                            bombCounter++;
                            matrix[row][col] = '+';
                        }
                    }
                    break;
                case "down":
                    if (isInBounds(matrix, row + 1, col)) {
                        row = row + 1;
                        if (matrix[row][col] == 'B') {
                            System.out.println("You found a bomb!");
                            bombCounter++;
                            matrix[row][col] = '+';
                        }
                    }
                    break;
            }
            if (bombCounter >= allBombs) {
                System.out.println("Congratulations! You found all bombs!");
                return;
            }
            if (matrix[row][col] == 'e') {
                System.out.printf("END! %d bombs left on the field", (allBombs - bombCounter));
                return;
            }
        }
        System.out.printf("%d bombs left on the field. Sapper position: (%d,%d)", (allBombs - bombCounter), row, col);
    }


    private static boolean isInBounds(char[][] matrix, int row, int col) {
        return row < matrix.length && row >= 0 && col < matrix[row].length && col >= 0;
    }
}
