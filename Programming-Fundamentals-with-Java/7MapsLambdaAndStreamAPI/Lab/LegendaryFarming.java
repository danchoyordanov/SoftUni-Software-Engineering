import java.util.*;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> collectionsOne = new LinkedHashMap<>();
        Map<String, Integer> collectionsTwo = new LinkedHashMap<>();
        collectionsOne.put("shards", 0);
        collectionsOne.put("fragments", 0);
        collectionsOne.put("motes", 0);

        boolean isObtained = false;

        while (!isObtained) {
            String[] tokens = scanner.nextLine().split("\\s+");

            for (int i = 0; i < tokens.length; i += 2) {
                int quantity = Integer.parseInt(tokens[i]);
                String material = tokens[i + 1].toLowerCase();
                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    collectionsOne.put(material, collectionsOne.get(material) + quantity);
                    if (collectionsOne.get(material) >= 250) {
                        collectionsOne.replace(material, collectionsOne.get(material) - 250);
                        if (material.equals("shards")) {
                            System.out.println("Shadowmourne obtained!");
                        } else if (material.equals("fragments")) {
                            System.out.println("Valanyr obtained!");
                        } else if (material.equals("motes")) {
                            System.out.println("Dragonwrath obtained!");
                        }
                        isObtained = true;
                        break;

                    }
                } else {
                    collectionsTwo.putIfAbsent(material, 0);
                    collectionsTwo.put(material, collectionsTwo.get(material) + quantity);
                }
            }
        }
        collectionsOne.entrySet().stream().sorted((f, s) -> {
            int result = s.getValue().compareTo(f.getValue());
            if (result == 0) {
                result = f.getKey().compareTo(s.getKey());
            }
            return result;
        }).forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
        collectionsTwo.entrySet().stream().sorted((f, s) -> f.getKey().compareTo(s.getKey())).
                forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
    }
}
