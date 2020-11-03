import java.util.Scanner;

public class AddAndSubtract {

    static int sumFirstSecondNum(int first, int second) {
        return first + second;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(sumFirstSecondNum(Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine())
        ) - Integer.parseInt(scanner.nextLine()));
    }

}

