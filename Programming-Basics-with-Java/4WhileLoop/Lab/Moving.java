import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int lenght = Integer.parseInt(scanner.nextLine());
        int hight = Integer.parseInt(scanner.nextLine());
        String boxes = scanner.nextLine();
        int sum = 0;
        int formulla = width * lenght *hight;
        while(!boxes.equals("Done")){
            int boxesNum = Integer.parseInt(boxes);
            sum += boxesNum;
            int differance = sum - formulla;
            if ( sum >= formulla){
                System.out.printf("No more free space! You need %d Cubic meters more.",differance);
                return;
            }
            boxes = scanner.nextLine();
        }
        System.out.printf("%d Cubic meters left.",(formulla- sum));
    }
}
