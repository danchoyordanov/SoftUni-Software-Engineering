import java.util.Scanner;

public class Grades {

    static void printSign(double number){
        if (number < 3){
            System.out.println("Fail");
        }else if(number >=3&&number <3.5){
            System.out.println("Poor");
        }else if (number >=3.50&& number <4.50){
            System.out.println("Good");
        }else if(number >=4.50 && number < 5.50){
            System.out.println("Very good");
        }else{
            System.out.println("Excellent");
        }
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        printSign(Double.parseDouble(scanner.nextLine()));
    }
}
