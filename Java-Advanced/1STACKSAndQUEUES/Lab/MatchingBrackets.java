import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        ArrayDeque<Integer> indexes = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        for (int i = 0; i < line.length(); i++) {
            char symbol = line.charAt(i);
            if(symbol == '('){
            indexes.push(i);
            }else if (symbol==')'){
                System.out.println(line.substring(indexes.pop(),i+1));
            }
        }
    }
}
