import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        StringBuilder password = new StringBuilder();
        for (int i = username.length() - 1; i >=0 ; i--) {
            password.append(username.charAt(i));
        }
        int counter = 0;
        while (counter < 4){
            String input = scanner.nextLine();
            if(input.equals(password.toString())){
                System.out.printf("User %s logged in.",username);
                return;
            }
            counter++;
            if(counter == 4){
                break;
            }
            System.out.println("Incorrect password. Try again.");


        }
        System.out.printf("User %s blocked!",username);
    }
}
