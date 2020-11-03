import java.util.Scanner;

public class PalindromeIntegers {
    private static boolean palindromeIntegers(String input) {

        String input1 = new StringBuffer(input).reverse().toString();
        if (input.equals(input1)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("END")) {
            if (palindromeIntegers(input)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            input = scanner.nextLine();
        }
    }

}
