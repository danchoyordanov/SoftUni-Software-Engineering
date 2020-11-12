import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {
    static class AdvertisementMessageе {
        String[] phases = {"Excellent product.", "Such a great product.", "I always use that product.",
                "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
        String[] events = {"Now I feel good.", "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
        String[] authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        Random random = new Random();

        public String randomMessage() {
            return String.format("%s %s %s - %s", phases[random.nextInt(phases.length)], events[random.nextInt(events.length)],
                    authors[random.nextInt(authors.length)], cities[random.nextInt(cities.length)]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<AdvertisementMessageе> spamAdvertisementMessage = new ArrayList<>();
        int times = Integer.parseInt(scanner.nextLine());
        AdvertisementMessageе message = new AdvertisementMessageе();
        for (int i = 0; i < times; i++) {
            System.out.println(message.randomMessage());
        }


    }

}
