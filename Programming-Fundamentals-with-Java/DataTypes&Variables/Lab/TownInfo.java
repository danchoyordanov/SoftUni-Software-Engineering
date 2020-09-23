import java.math.BigDecimal;
import java.util.Scanner;

public class TownInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameOfTown = scanner.nextLine();
        int population = Integer.parseInt(scanner.nextLine());
        int squareKM = Integer.parseInt(scanner.nextLine());
        System.out.printf("Town %s has population of %d and area %d square km.",nameOfTown,population,squareKM);
    }
}
