import java.util.ArrayDeque;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            String[] commands = scanner.nextLine().split("\\s+");
            switch (commands[0]){
                case "1":
                    stack.push(Integer.parseInt(commands[1]));
                    break;
                case "2":
                    stack.pop();
                    break;
                case"3":
                    System.out.println(MaxElement(stack));
                    break;
            }
        }
    }
    static int MaxElement(ArrayDeque<Integer> stack){
        int max = Integer.MIN_VALUE;
        for (Integer integer : stack) {
            if(max<integer){
                max=integer;
            }
        }
        return max;
    }
}
