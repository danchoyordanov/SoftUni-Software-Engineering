import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> parkingNumbers = new LinkedHashSet<>();

        String input = scanner.nextLine();
        while (!input.equals("END")){
            String registration = input.substring(input.indexOf(", ") + 2);
            if (input.contains("IN")){
                parkingNumbers.add(registration);
            }else{
                parkingNumbers.remove(registration);
            }
            input = scanner.nextLine();
        }
        if(parkingNumbers.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }else{
            String output = parkingNumbers
                    .stream()
                    .collect(Collectors.joining(System.lineSeparator()));

            System.out.println(output);
        }
    }
}
