import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> data = new LinkedHashMap<>();
        String[] givenInfo = scanner.nextLine().split(" : ");
        while (!givenInfo[0].equals("end")) {
            if (!data.containsKey(givenInfo[0])) {
                data.put(givenInfo[0], new ArrayList<>());
            }
            data.get(givenInfo[0]).add(givenInfo[1]);

            givenInfo = scanner.nextLine().split(" : ");
        }
        data.entrySet()
                .stream()
                .sorted((f, s) -> s.getValue().size() - f.getValue().size())
                .forEach(e -> {
                    System.out.println(e.getKey() + ": " + e.getValue().size());
                    e.getValue().stream().sorted((f, s) -> f.compareTo(s)).forEach(s -> System.out.println("-- " + s));
                });
    }
}
