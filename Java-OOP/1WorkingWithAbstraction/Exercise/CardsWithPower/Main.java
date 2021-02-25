package CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Card card = new Card(CardRank.valueOf(scanner.nextLine()), CardSuit.valueOf(scanner.nextLine()));
        System.out.println(card.toString());


    }
}
