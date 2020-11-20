import java.util.*;

public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<Character>> data = new LinkedHashMap<>();

        data.putIfAbsent("numbers", new ArrayList<>());
        data.putIfAbsent("letter", new ArrayList<>());
        data.putIfAbsent("other", new ArrayList<>());

        String line = new String(scanner.nextLine());
        for (int i = 0; i < line.length(); i++) {
            if (Character.isDigit(line.charAt(i))) {
                data.get("numbers").add(line.charAt(i));
            } else if (Character.isLetter(line.charAt(i))) {
                data.get("letter").add(line.charAt(i));
            } else {
                data.get("other").add(line.charAt(i));
            }
        }
        data.entrySet().stream().forEach(v -> {
            v.getValue();
            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < v.getValue().size(); j++) {
                    System.out.print(v.getValue().get(j));
                }
                System.out.println();
            }
        });


    }

    private static String repeat(String str, int length) {
        String[] strRepeart = new String[length];
        for (int i = 0; i < strRepeart.length; i++) {
            strRepeart[i] = str;
        }
        return String.join("", strRepeart);
    }
}
