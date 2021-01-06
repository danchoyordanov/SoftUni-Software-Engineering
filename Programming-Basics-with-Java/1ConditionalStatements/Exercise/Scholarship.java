import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double income = Double.parseDouble(scanner.next());
        double evaluation = Double.parseDouble(scanner.next());
        double minSalary = Double.parseDouble(scanner.next());
        double scholarship450 = 0;
        double scholarshipPrice550 = 0;
        if (income <= minSalary && evaluation >= 4.50){
            scholarship450 = Math.floor(minSalary * 0.35);
        }
        if (evaluation>=5.50){
            scholarshipPrice550 = Math.floor(evaluation * 25);
        }
        if (scholarship450 > scholarshipPrice550) {
            System.out.printf("You get a Social scholarship %.0f BGN",scholarship450);
        } else if (scholarshipPrice550 > scholarship450) {
            System.out.printf("You get a scholarship for excellent results %.0f BGN", scholarshipPrice550);
        } else {
            System.out.printf("You cannot get a scholarship!");
        }
    }
}
