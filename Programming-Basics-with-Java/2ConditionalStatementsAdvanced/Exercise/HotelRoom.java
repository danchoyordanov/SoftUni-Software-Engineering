import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int numberNights = Integer.parseInt(scanner.nextLine());
        double apartment = 0;
        double studio = 0;
        double priceStudio = 0;
        double priceApartment = 0;
        double discount = 0;
        double discountApartmentOnly = 0;
        switch (month) {
            case "May" :
            case  "October" : {
                if (numberNights > 14) {
                    discount = 0.30;
                } else if (numberNights > 7) {
                    discount = 0.05;
                }
                priceStudio = 50;
                priceApartment = 65;
                break;
            }
            case "June":
            case "September":  {
                if (numberNights > 14) {
                    discount = 0.20;
                }
                priceStudio = 75.2;
                priceApartment = 68.70;
                break;
            }
            case "July":
            case "August" : {
                priceStudio = 76;
                priceApartment = 77;
                break;
            }
        }
        if (numberNights > 14){
            discountApartmentOnly = 0.10;
            apartment = priceApartment * numberNights - (priceApartment * numberNights * 0.10);
        }else{
            apartment = priceApartment * numberNights;
        }
        studio = priceStudio * numberNights -(priceStudio * numberNights * discount);
        System.out.printf("Apartment: %.2f lv.%n",apartment);
        System.out.printf("Studio: %.2f lv.",studio);
    }
}
