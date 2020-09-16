import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int clock = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        minutes += 30;
        if (minutes >= 60){
            minutes = minutes % 60 ;
            clock += 1;
        }
        if (clock  > 23 ){
            clock = clock % 24 ;
        }
        System.out.printf("%d:%02d",clock,minutes);
    }
}
