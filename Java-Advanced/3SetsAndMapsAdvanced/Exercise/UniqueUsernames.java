import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Set<String> setOfNames = new LinkedHashSet<>();
        while (n-- > 0) {
            String name = scanner.nextLine();
            setOfNames.add(name);
        }
        for (String setOfName : setOfNames) {
            System.out.println(setOfName);
        }
    }
}
