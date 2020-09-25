import java.util.Scanner;


public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacity = 255;
        int numLines = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i < numLines; i++) {
            int litres = Integer.parseInt(scanner.nextLine());
            capacity -= litres;
            if (capacity >= 0) {
                sum += litres;
            } else{
                System.out.println("Insufficient capacity!");
                capacity += litres;
                continue;
            }
        }
        System.out.println(sum);
    }
}
