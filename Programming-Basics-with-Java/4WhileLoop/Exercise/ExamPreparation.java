import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int failedThreshold = Integer.parseInt(scanner.nextLine());
        int failedTimes = 0;
        int solvedExamsCount = 0;
        String lastProblem = "";
        boolean isFailed = true;
        double gradeSum = 0;
        while(failedTimes<failedThreshold){
            String problemName = scanner.nextLine();
            if(problemName.equals("Enough")){
                isFailed = false;
                break;
            }
            int grade = Integer.parseInt(scanner.nextLine());
            if(grade <=4){
                failedTimes++;
            }
            gradeSum += grade;
            solvedExamsCount++;
            lastProblem = problemName;
        }
        double average = gradeSum / solvedExamsCount;
        if(isFailed){
            System.out.printf("You need a break, %d poor grades.",failedThreshold);
        }else {
            System.out.printf("Average score: %.2f%n",average);
            System.out.printf("Number of problems: %d%n", solvedExamsCount);
            System.out.printf("Last problem: %s", lastProblem);
        }
    }
}
