import java.util.*;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(" ");
        String print = "";
        for (int i = 0; i < line.length; i++) {
            for (int j = 0; j < line[i].length(); j++) {
                print = print.concat(line[i]);
            }
        }

        System.out.println(print);
    }
}
