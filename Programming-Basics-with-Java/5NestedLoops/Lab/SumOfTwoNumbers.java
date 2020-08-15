import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magical = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        boolean flag = false;
        String output = "";
        for (int i = start ; i <= end ; i++){
            for (int j = start; j <= end ; j++) {
                counter++;
                if (i + j == magical){
                    output = String.format("Combination N:%d (%d + %d = %d)",counter,i,j,magical);
                    flag=true;
                    break;
                }
            }
            if(flag){
                break;
            }
        }
        if (flag) {
            System.out.println(output);
        }else {
            System.out.printf("%d combinations - neither equals %d", counter, magical);
        }
    }
}
