import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> queuePrinter = new ArrayDeque<>();
        String input = scanner.nextLine();
        while(!input.equals("print")){
            if(input.equals("cancel")){
                String fileName = queuePrinter.poll();
                if(fileName!=null){
                    System.out.println("Canceled "+fileName);
                }else{
                    System.out.println("Printer is on standby");
                }
            }else {
                queuePrinter.offer(input);
            }
            input = scanner.nextLine();
        }
        for (String s : queuePrinter) {
            System.out.println(s);
        }

    }
}
