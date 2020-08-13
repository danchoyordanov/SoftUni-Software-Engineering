import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bookName = scanner.nextLine();
        String input = scanner.nextLine();

        int i = 0;
        while(!input.equals("No More Books")){
            if (input.equals(bookName)){
                System.out.printf("You checked %d books and found it.",i);
                return;
            }
            i++;
            input= scanner.nextLine();
        }
        System.out.printf("The book you search is not here!%nYou checked %d books.",i);
    }
}
