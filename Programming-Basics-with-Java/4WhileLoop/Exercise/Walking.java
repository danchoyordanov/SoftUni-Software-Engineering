import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stepSum = 0;
        int homeCount = 0;
        int differance = 0;
        while(stepSum < 10000  ){
            String step = scanner.nextLine();
            if(step.equals("Going home")){
                int summ = Integer.parseInt(scanner.nextLine());
                stepSum += summ;
                if (homeCount < 1 && stepSum > 10000) {
                    differance = stepSum - 10000;
                    System.out.printf("Goal reached! Good job!%n%d steps over the goal!", Math.abs(differance));
                    return;
                }else if(homeCount < 1 && stepSum < 10000){
                    differance = 10000 - stepSum;
                    System.out.printf("%d more steps to reach goal.",Math.abs(differance));
                    return;
                }
                homeCount ++;
                continue;
            }
            stepSum += Integer.parseInt(step);
        }
        System.out.printf("Goal reached! Good job!%n%d steps over the goal!",Math.abs(stepSum-10000));
    }
}
