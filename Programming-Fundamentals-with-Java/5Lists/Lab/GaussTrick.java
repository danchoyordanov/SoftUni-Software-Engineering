import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> arraylist = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).
                collect(Collectors.toList());
        List<Integer> print = new ArrayList<>();

        int i = 0;
        while (i < arraylist.size() / 2) {
            print.add(arraylist.get(i) + arraylist.get(arraylist.size() - 1 - i));
            i++;
        }
        if (arraylist.size() % 2 != 0) {
            print.add(arraylist.get(arraylist.size() / 2));
        }
        for (Integer integer : print) {
            System.out.print(integer + " ");
        }
    }
}

