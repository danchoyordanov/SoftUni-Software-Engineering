import java.util.Scanner;

public class GraduationPt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double sum = 0.0;
        int counter = 1;
        int excluded = 0;
        while(counter <=12){
            double grade = Double.parseDouble(scanner.nextLine());
            if(grade <4.00){
                excluded++;
                if ( excluded>1 ) {
                    System.out.printf("%s has been excluded at %d grade",name,counter);
                    return;
                }
                continue;
            }
            sum = sum + grade;
            counter += 1;
        }
        double average = sum / 12 ;
        System.out.printf("%s graduated. Average grade: %.2f",name,average);
    }
}
