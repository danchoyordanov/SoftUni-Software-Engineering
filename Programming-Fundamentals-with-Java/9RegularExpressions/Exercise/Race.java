import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> contestants = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        Map<String, Integer> map = new LinkedHashMap<>();
        for (String contestant : contestants) {
            map.putIfAbsent(contestant, 0);
        }

        String regexName = "[A-Za-z]";
        String regexKm = "[0-9]";
        Pattern namePattern = Pattern.compile(regexName);
        Pattern kmPattern = Pattern.compile(regexKm);
        String input = scanner.nextLine();
        while (!input.equals("end of race")) {
            Matcher nameMatcher = namePattern.matcher(input);
            StringBuilder names = new StringBuilder();
            while (nameMatcher.find()) {
                names.append(nameMatcher.group());
            }

            Matcher kmMatcher = kmPattern.matcher(input);
            int sum = 0;
            while (kmMatcher.find()) {
                sum += Integer.parseInt(kmMatcher.group());
            }

            if (map.containsKey(names.toString())) {
                int current = map.get(names.toString());
                map.put((names.toString()), sum + current);
            }
            input = scanner.nextLine();
        }
        List<String> winners = map.entrySet().stream().sorted((a, b) -> b.getValue().compareTo(a.getValue())).
                limit(3).map(Map.Entry::getKey)
                .collect(Collectors.toList());
        int count = 1;
        for (String winner : winners) {
            switch (count++) {
                case 1:
                    System.out.println("1st place: " + winner);
                    break;
                case 2:
                    System.out.println("2nd place: " + winner);
                    break;
                case 3:
                    System.out.println("3rd place: " + winner);
                    break;
            }
        }
    }
}
