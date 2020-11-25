import java.util.*;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(", ");

        for (String s : line) {
            if (checkPassword(s)) {
                System.out.println(s);
            }
        }

    }

    public static boolean checkPassword(String username) {
        if (username.length() < 3 || username.length() > 16) {
            return false;
        }
        for (int i = 0; i < username.length(); i++) {
            char character = username.charAt(i);
            if (!Character.isLetterOrDigit(character) && character != '-' && character != '_') {
                return false;
            }
        }
        return true;
    }
}
