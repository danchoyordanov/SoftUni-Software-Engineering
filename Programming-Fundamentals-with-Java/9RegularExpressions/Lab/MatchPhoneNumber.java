import java.util.*;
        import java.util.regex.Matcher;
        import java.util.regex.Pattern;

public class MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "\\+359([- ])2\\1[\\d]{3}\\1[\\d]{4}\\b";
        List<String> numbersList = new ArrayList<>();
        String readNames = scanner.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(readNames);
        while (matcher.find()){
            numbersList.add(matcher.group());
        }
        System.out.println(String.join(", ",numbersList));
    }
}
