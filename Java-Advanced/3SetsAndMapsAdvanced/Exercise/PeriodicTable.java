import java.util.*;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Set<String> name = new TreeSet<>();
        while (n-- > 0) {
            String[] chemical = scanner.nextLine().split("\\s+");
            for (int i = 0; i < chemical.length; i++) {
                name.add(chemical[i]);
            }
        }
        name.forEach(e -> {
            System.out.print(e + " ");
        });
    }
}
