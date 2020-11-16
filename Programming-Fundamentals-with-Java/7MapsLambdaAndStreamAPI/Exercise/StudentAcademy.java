import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Double> students = new LinkedHashMap<>();
        Map<String, Integer> keepResult = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double score = Double.parseDouble(scanner.nextLine());
            students.putIfAbsent(name, 0.0);
            keepResult.putIfAbsent(name, 0);
            keepResult.put(name, keepResult.get(name) + 1);
            double last = students.get(name);
            double sum = score + last;
            int currentTimes = keepResult.get(name);
            students.put(name, sum / currentTimes);

        }
        students.entrySet().stream()
                .filter((a) -> a.getValue() >= 4.50)
                .sorted((a, b) -> Double.compare(b.getValue(), a.getValue()))
                .forEach(e -> System.out.printf("%s -> %.2f%n", e.getKey(), e.getValue()));
    }
}
