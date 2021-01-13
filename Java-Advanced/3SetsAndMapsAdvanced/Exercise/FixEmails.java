import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> dataInfo = new LinkedHashMap<>();
        String name = scanner.nextLine();
        while (!name.equals("stop")){
            String email = scanner.nextLine();
            if((!email.contains(".us"))&&(!email.contains(".uk"))&&(!email.contains(".com"))){
                dataInfo.put(name, email);
            }
            name = scanner.nextLine();
        }
        dataInfo.forEach((k,v) -> {
            System.out.printf("%s -> %s%n",k,v);
        });
    }
}
