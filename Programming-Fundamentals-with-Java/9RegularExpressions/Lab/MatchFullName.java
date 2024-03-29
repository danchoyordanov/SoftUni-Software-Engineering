import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFullName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "\\b([A-Z][a-z]+) ([A-Z][a-z]+)\\b";
        String readNames = scanner.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(readNames);
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }
    }
}
