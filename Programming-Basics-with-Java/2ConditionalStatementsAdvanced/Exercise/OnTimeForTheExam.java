import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hourExam = Integer.parseInt(scanner.nextLine());
        int minutesExam = Integer.parseInt(scanner.nextLine());
        int hourArrival = Integer.parseInt(scanner.nextLine());
        int minutesArrival = Integer.parseInt(scanner.nextLine());
        int totalExamMins = hourExam * 60 + minutesExam;
        int totalArrivalMins = hourArrival * 60 + minutesArrival;
        int diff = totalExamMins - totalArrivalMins;
        int mm = diff % 60;
        int hh = diff / 60;
        if(totalArrivalMins == totalExamMins) {
            System.out.println("On time");
        }else if (diff > 0 && diff <= 30){
            System.out.println("On time");
            System.out.printf("%d minutes before the start",diff);
        }else if(diff >= 60){
            System.out.println("Early");
            System.out.printf("%d:%02d hours before the start",hh,mm);
        }else if(diff > 30 && diff <60){
            System.out.println("Early");
            System.out.printf("%d minutes before the start",mm);
        }else if (diff <=-60 ){

            System.out.println("Late");
            System.out.printf("%d:%02d hours after the start",Math.abs(hh),Math.abs(mm));
        }else if(diff > -60){

            System.out.println("Late");
            System.out.printf("%d minutes after the start",Math.abs(mm));
        }

    }
}
