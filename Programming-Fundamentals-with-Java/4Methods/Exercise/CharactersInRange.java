import java.util.Scanner;

public class CharactersInRange {
    public static void inBetween(char start, char end) {
        int count = 0;
        if ((int) start < (int) end) {
            for (int i = start + 1; i < end; i++) {
                System.out.print((char) i + " ");
            }
        }
        for (int i = end + 1; i < start; i++) {
            System.out.print((char) i + " ");
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        inBetween(scanner.nextLine().charAt(0), scanner.nextLine().charAt(0));
    }
}

