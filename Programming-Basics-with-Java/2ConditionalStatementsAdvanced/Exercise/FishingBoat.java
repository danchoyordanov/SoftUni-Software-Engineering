import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fisherman = Integer.parseInt(scanner.nextLine());
        double rentAShip = 0;
        switch(season){
            case "Spring" :
                rentAShip= 3000;
                if (fisherman <= 6){
                    rentAShip = rentAShip -(rentAShip * 0.10);
                }else if (fisherman > 7 && fisherman <= 11){
                    rentAShip = rentAShip -(rentAShip * 0.15);
                }else if (fisherman >12){
                    rentAShip = rentAShip -(rentAShip * 0.25);
                }

                if (fisherman %2 == 0) {
                    rentAShip = rentAShip - (rentAShip * 0.05);
                }
                break;
            case "Summer" :
                rentAShip = 4200;
                if (fisherman <= 6){
                    rentAShip = rentAShip -(rentAShip * 0.10);
                }else if (fisherman > 7 && fisherman <= 11){
                    rentAShip = rentAShip -(rentAShip * 0.15);
                }else if (fisherman >12){
                    rentAShip = rentAShip -(rentAShip * 0.25);
                }

                if (fisherman %2 == 0)
                    rentAShip = rentAShip -(rentAShip * 0.05);
                break;
            case "Autumn":
                rentAShip = 4200;
                if (fisherman <= 6){
                    rentAShip = rentAShip -(rentAShip * 0.10);
                }else if (fisherman > 7 && fisherman <= 11){
                    rentAShip = rentAShip -(rentAShip * 0.15);
                }else if (fisherman >12){
                    rentAShip = rentAShip -(rentAShip * 0.25);
                }

                break;
            case "Winter" :
                rentAShip = 2600;
                if (fisherman <= 6){
                    rentAShip = rentAShip -(rentAShip * 0.10);
                }else if (fisherman > 7 && fisherman <= 11){
                    rentAShip = rentAShip -(rentAShip * 0.15);
                }else if (fisherman >12){
                    rentAShip = rentAShip -(rentAShip * 0.25);
                }

                if (fisherman %2 == 0)
                    rentAShip = rentAShip -(rentAShip * 0.05);
                break;
        }
        double difference = 0;
        difference = budget - rentAShip;
        if (budget < rentAShip){
            System.out.printf("Not enough money! You need %.2f leva.",Math.abs(difference));
        }else if (budget >= rentAShip){
            System.out.printf("Yes! You have %.2f leva left.",Math.abs(difference));
        }
    }
}

