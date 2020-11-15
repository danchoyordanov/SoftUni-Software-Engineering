import java.util.*;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Integer> aMinerTask = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while(!input.equals("stop")){
            int quantity = Integer.parseInt(scanner.nextLine());
            if(aMinerTask.containsKey(input)){
                aMinerTask.put(input,aMinerTask.get(input)+quantity);
            }else{
                aMinerTask.put(input,quantity);
            }
            input = scanner.nextLine();
        }
        aMinerTask.forEach((k,v) -> System.out.println(k + " -> " + v));
    }
}
