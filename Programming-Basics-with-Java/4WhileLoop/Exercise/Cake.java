import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int all = a * b;

        String input = scanner.nextLine();
        while (!input.equals("STOP")){
            int cakeSize = Integer.parseInt(input);
            all = all - cakeSize;
            if ( all <=0){
                System.out.printf("No more cake left! You need %d pieces more.",Math.abs(all));
                return;
            }
            input = scanner.nextLine();
        }
        if(all > 0 ){
            System.out.printf("%d pieces are left.",all);
        }else {
            System.out.printf("No more cake left! You need %d pieces more.",Math.abs(all));
        }
    }
}
