import java.util.*;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        for (char c : line.toCharArray()) {
            System.out.print((char) (c + 3));
        }
    }
}
