package Ferrari;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ferrari car = new Ferrari(scanner.nextLine());
        System.out.println(car.toString());


    }
}
