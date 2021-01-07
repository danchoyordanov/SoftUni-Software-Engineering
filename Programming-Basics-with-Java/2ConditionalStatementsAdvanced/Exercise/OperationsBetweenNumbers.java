import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N1 = Integer.parseInt(scanner.nextLine());
        double N2 = Double.parseDouble(scanner.nextLine());
        String operation = scanner.nextLine();
        double result = 0;
        String type = "";
        if(N2 == 0){
            System.out.printf("Cannot divide %d by zero ", N1);
            return;
        }if(operation.equals("+") ){
            result = N1 + N2;
            if (result % 2 == 0) {
                type = "even";
            }else {
                type = "odd";
            }
            System.out.printf(" %d %s %.0f = %.0f - %s",N1,operation,N2,result,type);
        }if(operation.equals("-") ){
            result = N1 - N2;
            if (result % 2 == 0) {
                type = "even";
            }else {
                type = "odd";
            }
            System.out.printf(" %d %s %.0f = %.0f - %s",N1,operation,N2,result,type);
        }if(operation.equals("*") ){
            result = N1 * N2;
            if (result % 2 == 0) {
                type = "even";
            }else {
                type = "odd";
            }
            System.out.printf(" %d %s %.0f = %.0f - %s",N1,operation,N2,result,type);
        }if(operation.equals("/")){
            result = N1 / N2;
            System.out.printf(" %d / %.0f = %.2f ",N1,N2,result);
        }if(operation.equals("%")){
            result = N1 % N2;
            System.out.printf("%d %% %.0f = %.0f ",N1,N2, result);
        }
    }
}
