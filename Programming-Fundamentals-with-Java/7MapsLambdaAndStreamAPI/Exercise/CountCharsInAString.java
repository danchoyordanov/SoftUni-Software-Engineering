import java.util.*;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character, Integer> count = new LinkedHashMap<>();
        String words = scanner.nextLine();

        for (char c : words.toCharArray()) {
            if (c != ' ') {
                if (count.containsKey(c)) {
                    count.put(c, count.get(c) + 1);
                } else {
                    count.put(c, 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> entry : count.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
