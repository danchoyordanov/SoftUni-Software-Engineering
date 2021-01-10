import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<Character, Integer> info = new TreeMap<>();

        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            info.putIfAbsent(symbol, 0);
            info.put(symbol, info.get(symbol) + 1);
        }
        info.forEach((k, v) -> {
            System.out.printf("%s: %d time/s%n", k, v);
        });
    }
}
