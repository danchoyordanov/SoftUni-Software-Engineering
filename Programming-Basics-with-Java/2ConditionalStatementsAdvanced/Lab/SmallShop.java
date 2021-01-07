import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeDrink = scanner.nextLine();
        String location = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        if (typeDrink.equals("coffee")) {
            if (location.equals("Sofia")) {
                System.out.println(0.50 * quantity);
            } else if (location.equals("Plovdiv")) {
                System.out.println(0.40 * quantity);
            } else if (location.equals("Varna")) {
                System.out.println(0.45 * quantity);
            }
        } else if (typeDrink.equals("water")) {
            if (location.equals("Sofia")) {
                System.out.println(0.80 * quantity);
            } else if (location.equals("Plovdiv")) {
                System.out.println(0.70 * quantity);
            } else if (location.equals("Varna")) {
                System.out.println(0.70 * quantity);
            }
        } else if (typeDrink.equals("beer")) {
            if (location.equals("Sofia")) {
                System.out.println(1.20 * quantity);
            } else if (location.equals("Plovdiv")) {
                System.out.println(1.15 * quantity);
            } else if (location.equals("Varna")) {
                System.out.println(1.10 * quantity);
            }
        } else if (typeDrink.equals("sweets")) {
            if (location.equals("Sofia")) {
                System.out.println(1.45 * quantity);
            } else if (location.equals("Plovdiv")) {
                System.out.println(1.30 * quantity);
            } else if (location.equals("Varna")) {
                System.out.println(1.35 * quantity);
            }
        }else if (typeDrink.equals("peanuts")) {
            if (location.equals("Sofia")) {
                System.out.println(1.60 * quantity);
            } else if (location.equals("Plovdiv")) {
                System.out.println(1.50 * quantity);
            } else if (location.equals("Varna")) {
                System.out.println(1.55 * quantity);
            }
        }
    }
}
