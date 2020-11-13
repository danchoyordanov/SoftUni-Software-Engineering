import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> wordsSynonyms = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            List<String> currentSynonyms = wordsSynonyms.get(word);

            if (currentSynonyms == null) {
                currentSynonyms = new ArrayList<>();
                wordsSynonyms.put(word, currentSynonyms);
            }
            currentSynonyms.add(synonym);
        }
        for (Map.Entry<String, List<String>> entry : wordsSynonyms.entrySet()) {
            System.out.println(entry.getKey() + " - " + String.join(", ", entry.getValue()));
        }
    }
}
