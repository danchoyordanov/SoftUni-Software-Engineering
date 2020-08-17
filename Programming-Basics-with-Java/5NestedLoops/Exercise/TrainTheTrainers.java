import java.util.Scanner;

public class TrainTheTrainers{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int judge = Integer.parseInt(scanner.nextLine());
        String presentationName = scanner.nextLine();
        double allSum = 0;
        int allCount = 0;
        while(!presentationName.equals("Finish")){
            double evaluationSum = 0;
            double evaluationD = 0;
            for (int i = 0 ; i < judge ; i++){
                double evaluation = Double.parseDouble(scanner.nextLine());
                evaluationSum += evaluation;
            }
            evaluationD = evaluationSum/judge;
            allSum += evaluationD;
            allCount++;
            System.out.printf("%s - %.02f.%n",presentationName,evaluationD);
            presentationName = scanner.nextLine();
        }
        double allD = allSum / allCount;
        System.out.printf("Student's final assessment is %.02f.",allD);
    }
}
