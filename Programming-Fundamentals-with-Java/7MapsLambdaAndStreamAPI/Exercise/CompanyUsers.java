import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> companyUsers = new LinkedHashMap<>();
        String[] lineOfInfo = scanner.nextLine().split(" -> ");
        while (!lineOfInfo[0].equals("End")) {
            companyUsers.putIfAbsent(lineOfInfo[0], new LinkedList<>());
            if (!companyUsers.get(lineOfInfo[0]).contains(lineOfInfo[1])) {
                companyUsers.get(lineOfInfo[0]).add(lineOfInfo[1]);
            }
            lineOfInfo = scanner.nextLine().split(" -> ");
        }

        companyUsers.entrySet().stream()
                .sorted((a, b) -> a.getKey().compareTo(b.getKey()))
                .forEach(e -> {
                    System.out.println(e.getKey());
                    e.getValue().stream().forEach(s -> System.out.println("-- " + s));
                });
    }
}
