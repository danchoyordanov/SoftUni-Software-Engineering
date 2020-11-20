import java.util.*;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String print = "";
        while (!input.equals("end")){
            for (int i = input.length()-1; i >=0 ; i--) {
                print += input.charAt(i);
            }
            System.out.println(input+" = "+print);
            print = "";
            input = scanner.nextLine();
        }
    }
}
