import java.util.Scanner;

public class PasswordValidator {
    public static boolean inclusiveCharacters(String password) {
        if (password.length() < 6 || password.length() > 10) {
            return false;
        }
        return true;

    }

    public static boolean onlyLettersNDigits(String password) {
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            boolean isLetter = Character.isLetter(symbol);
            boolean isDigit = Character.isDigit(symbol);
            if (!isDigit && !isLetter) {
                return false;
            }
        }
        return true;
    }

    public static boolean twoDigits(String password) {
        int digitTimes = 0;
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            if (Character.isDigit(symbol)) {
                digitTimes++;
            }
            if (digitTimes == 2) {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        int errors = 0;
        if (!inclusiveCharacters(password)) {
            errors++;
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!onlyLettersNDigits(password)) {
            errors++;
            System.out.println("Password must consist only of letters and digits");
        }
        if (!twoDigits(password)) {
            errors++;
            System.out.println("Password must have at least 2 digits");
        }
        if (errors == 0) {
            System.out.println("Password is valid");
        }

    }

}
