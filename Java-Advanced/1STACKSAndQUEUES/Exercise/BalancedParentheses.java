import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> stack = new ArrayDeque<>();
        String[] input = scanner.nextLine().split("");
        boolean isBalanced = false;
        for (int i = 0; i < input.length; i++) {
            if (input[i].equals("(")) {
                stack.push(input[i]);
            } else if (input[i].equals(")") && Objects.equals(stack.peek(), "(")) {
                stack.pop();
            } else if (input[i].equals(")")) {
                stack.push(input[i]);
            }

            if (input[i].equals("[")) {
                stack.push(input[i]);
            } else if (input[i].equals("]") && Objects.equals(stack.peek(), "[")) {
                stack.pop();
            } else if (input[i].equals("]")) {
                stack.push(input[i]);
            }

            if (input[i].equals("{")) {
                stack.push(input[i]);
            } else if (input[i].equals("}") && Objects.equals(stack.peek(), "{")) {
                stack.pop();
            } else if (input[i].equals("}")) {
                stack.push(input[i]);
            }
        }
        if(stack.isEmpty()){
            isBalanced=true;
        }
        if(isBalanced){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}
