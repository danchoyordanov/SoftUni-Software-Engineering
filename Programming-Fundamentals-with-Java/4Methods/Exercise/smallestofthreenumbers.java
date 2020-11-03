import java.util.Scanner;

public class smallestofthreenumbers {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double lowestNumber = Double.MAX_VALUE;
        int numberToPrint = 0;
        for (int i = 0; i < 3; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (i == 0) {
                numberToPrint = number;
            }
            if (number <= lowestNumber) {
                lowestNumber = number;
                numberToPrint = (int) lowestNumber;
            }

        }
        System.out.println(numberToPrint);
    }
}

