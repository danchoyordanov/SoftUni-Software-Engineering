import java.text.DecimalFormat;
import java.util.*;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Double> info = new TreeMap<>();
        DecimalFormat decimalFormat = new DecimalFormat("#.###################");

        while (n-- > 0){
            String name = scanner.nextLine();
            double[] scores = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToDouble(Double::parseDouble).toArray();
            double average = 0;
            for (double score : scores) {
                average +=score;
            }
            average = average / scores.length;

            info.put(name,average);

        }
        info.forEach((k,v) ->{
            System.out.printf("%s is graduated with %s\n",k,decimalFormat.format(v));
        });
    }
}
