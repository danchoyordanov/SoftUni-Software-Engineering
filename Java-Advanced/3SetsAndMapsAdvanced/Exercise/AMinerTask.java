import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> dataInfo = new LinkedHashMap<>();
        String type = scanner.nextLine();
        while (!type.equals("stop")) {
            Integer amount = Integer.parseInt(scanner.nextLine());
            if (!dataInfo.containsKey(type)) {
                dataInfo.put(type, amount);
            } else {
                dataInfo.put(type, dataInfo.get(type) + amount);
            }
            type = scanner.nextLine();
        }
        dataInfo.forEach((k, v) -> {
            System.out.printf("%s -> %d%n", k, v);
        });
    }
}
