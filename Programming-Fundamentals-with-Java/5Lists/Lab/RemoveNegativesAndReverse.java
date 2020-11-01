import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split(" ")).
                map(Integer::parseInt).collect(Collectors.toList());
        list.removeIf(n -> n < 0);
        Collections.reverse(list);
        if (list.isEmpty()) {
            System.out.println("empty");
        } else {
            int i = 0;
            while (i < list.size()) {
                System.out.print(list.get(i) + " ");
                i++;
            }
        }
    }
}