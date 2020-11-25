import java.util.*;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        char previousChar = line.charAt(0);
        sb.append(previousChar);

        for (int i = 1; i < line.length(); i++) {
            char currentChar = line.charAt(i);
            if (previousChar != currentChar) {
                sb.append(currentChar);
                previousChar = currentChar;
            }
        }
        System.out.println(sb);
    }
}
