import java.util.*;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] readLine = scanner.nextLine().split(" ");
        int totalSum = 0;
        System.out.println(multiplier(readLine[0], readLine[1]));

    }

    public static int multiplier(String one, String two) {
        int sum = 0;
        if (one.length() >= two.length()) {
            for (int i = 0; i < one.length(); i++) {
                if (i < two.length()) {
                    sum += one.charAt(i) * two.charAt(i);
                } else {
                    sum += one.charAt(i);
                }
            }

        } else {
            for (int i = 0; i < two.length(); i++) {
                if (i < one.length()) {
                    sum += one.charAt(i) * two.charAt(i);
                } else {
                    sum += two.charAt(i);
                }
            }
        }
        return sum;
    }
}
