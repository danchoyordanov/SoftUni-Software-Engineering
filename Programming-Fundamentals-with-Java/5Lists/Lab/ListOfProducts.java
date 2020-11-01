import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListOfProducts {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> list = new ArrayList<>();
        int i = 0;
        while (i < n) {
            list.add(scanner.nextLine());
            i++;
        }
        Collections.sort(list);
        i = 0;
        while (i < list.size()) {
            System.out.println((i + 1) + "." + list.get(i));
            i++;
        }
    }
}