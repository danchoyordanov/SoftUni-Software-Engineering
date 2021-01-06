import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int time = Integer.parseInt(scanner.next());
        int minutes = Integer.parseInt(scanner.next());
        minutes = minutes + 15;
        if (minutes >= 60 ){
            minutes = minutes % 60;
            time = time + 1;
        }
        if (time == 24){
            time = 00;
        }
        System.out.printf("%d:%02d",time,minutes);;
    }
}
