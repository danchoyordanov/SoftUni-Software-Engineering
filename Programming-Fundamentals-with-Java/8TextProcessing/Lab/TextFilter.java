import java.util.*;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] lineTwo = scanner.nextLine().split(", ");
        String line = scanner.nextLine();
        for (String s : lineTwo) {
            line=line.replace(s,repeat("*",s.length()));
        }
        System.out.println(line);

    }

    private static String repeat(String str, int length) {
        String[] strRepeart = new String[length];
        for (int i = 0; i < strRepeart.length; i++) {
            strRepeart[i] = str;
        }
        return String.join("",strRepeart);
    }
}
