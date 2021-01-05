import java.util.*;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numberNMArray = Arrays.stream(scanner.nextLine().split("\\s+")).
                mapToInt(Integer::parseInt).toArray();
        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();
        for (int i = 0; i < numberNMArray[0]; i++) {
            firstSet.add(Integer.parseInt(scanner.nextLine()));
        }
        for (int i = 0; i < numberNMArray[1]; i++) {
            secondSet.add(Integer.parseInt(scanner.nextLine()));
        }
        firstSet.forEach(e-> {
            if(secondSet.contains(e)) {
                System.out.print(e + " ");
            }
        });
    }
}
