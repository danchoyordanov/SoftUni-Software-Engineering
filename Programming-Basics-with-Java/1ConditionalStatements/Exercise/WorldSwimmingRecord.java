import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double recordInSeconds = Double.parseDouble(scanner.next());
        double distanceMetres = Double.parseDouble(scanner.next());
        double timeInSecondsForMetre = Double.parseDouble(scanner.next());
        double IvanTimeInSeconds = distanceMetres * timeInSecondsForMetre;
        if (distanceMetres >=15) {
            double timesHeWillBeSlowed = distanceMetres / 15;
            double secondsOfSlow = Math.floor(timesHeWillBeSlowed) * 12.5;
            IvanTimeInSeconds = IvanTimeInSeconds + secondsOfSlow;
        }
        double difference = recordInSeconds - IvanTimeInSeconds;
        if( IvanTimeInSeconds < recordInSeconds ) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",IvanTimeInSeconds);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.",Math.abs(difference));
        }
    }
}
