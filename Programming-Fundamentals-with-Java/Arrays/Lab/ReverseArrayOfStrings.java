import java.util.Scanner;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] readyPart =  line.split(" ");
        for (int i = readyPart.length -1; i >= 0; i--) {
            System.out.print(readyPart[i] + " ");
        }
    }
}
