import java.util.Scanner;

public class FruitOrVegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruits = scanner.next();
        if (fruits.equals("banana") || fruits.equals("apple")|| fruits.equals("kiwi") ||fruits.equals("cherry") ||
                fruits.equals("lemon") ||fruits.equals("grapes")){
            System.out.println("fruit");
        }else if (fruits.equals("tomato")||fruits.equals("cucumber")||fruits.equals("pepper")||fruits.equals("carrot")){
            System.out.println("vegetable");
        } else {
            System.out.println("unknown");
        }
    }
}
