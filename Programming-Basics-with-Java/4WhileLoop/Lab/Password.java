import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String regPassword = scanner.nextLine();
        String loginPassword = scanner.nextLine();

        while (!loginPassword.equals(regPassword)){
            loginPassword=scanner.nextLine();
        }
        System.out.printf("Welcome %s!",username);
    }
}
