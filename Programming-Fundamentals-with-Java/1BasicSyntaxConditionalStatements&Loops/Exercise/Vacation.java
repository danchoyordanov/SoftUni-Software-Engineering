import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String  day = scanner.nextLine();
        double price;
        double sum;
        if(type.equalsIgnoreCase("Students")){
            if(day.equalsIgnoreCase("Friday")){
                price = 8.45;
            }else if(day.equalsIgnoreCase("Saturday")) {
                price = 9.80;
            }else {
                price = 10.46;
            }
        }else if(type.equalsIgnoreCase("Business")){
            if(day.equalsIgnoreCase("Friday")){
                price = 10.90;
            }else if(day.equalsIgnoreCase("Saturday")) {
                price = 15.60;
            }else {
                price = 16;
            }
        }else {
            if(day.equalsIgnoreCase("Friday")){
                price = 15;
            }else if(day.equalsIgnoreCase("Saturday")) {
                price = 20;
            }else {
                price = 22.50;
            }
        }
        if(type.equalsIgnoreCase("Students")&&numberOfPeople>= 30) {
            sum = numberOfPeople * price - ((numberOfPeople * price) * 0.15);
        }else if(type.equalsIgnoreCase("Business")&&numberOfPeople>= 100){
            sum =(numberOfPeople - 10) * price;
        }else if (type.equalsIgnoreCase("Regular") && numberOfPeople>=10 && numberOfPeople <=20){
            sum = numberOfPeople * price - ((numberOfPeople * price) * 0.05);
        }else {
            sum = numberOfPeople * price;
        }
        System.out.printf("Total price: %.2f",sum);
    }
}

