import java.util.*;

public class AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, ArrayList<Double>> data = new TreeMap<>();
        while (n-- > 0){
            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            double score = Double.parseDouble(input[1]);
            data.putIfAbsent(name,new ArrayList<>());
            data.get(name).add(score);
        }
        data.forEach((key,value)->
                System.out.printf("%s -> %s(avg: %.2f)%n",key
                        ,toString(value),value.stream()
                                .mapToDouble(e->e).average().getAsDouble())
        );
    }

    private static String toString(ArrayList<Double> value) {
        StringBuilder str=new StringBuilder();
        for (Double aDouble : value) {
            str.append( String.format("%.2f ",aDouble));
        }
        return str.toString();
    }
}
