import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> first = Arrays.stream(scanner.nextLine().split(" ")).
                map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> second = Arrays.stream(scanner.nextLine().split(" ")).
                map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> forPrint = new ArrayList<>();
        int i = 0;
        int iOld = 0;
        int bothSize = first.size() + second.size();
        while (i < bothSize) {

            if (iOld < first.size()) {
                forPrint.add(i, first.get(iOld));
                i++;
            }
            if (iOld < second.size()) {
                forPrint.add(i, second.get(iOld));
                i++;
            }
            iOld++;
        }
        for (Integer integer : forPrint) {
            System.out.print(integer + " ");
        }
    }
}

