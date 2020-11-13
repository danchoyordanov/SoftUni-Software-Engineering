import java.util.*;
import java.util.stream.Collectors;

public class Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> lineOfNumbers = Arrays.stream(scanner.nextLine().split(" ")).
                map(Integer::parseInt).sorted((n1, n2) -> Integer.compare(n2, n1)).limit(3).collect(Collectors.toList());
        for (Integer lineOfNumber : lineOfNumbers) {
            System.out.print(lineOfNumber + " ");
        }
    }
}
