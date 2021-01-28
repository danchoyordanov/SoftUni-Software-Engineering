import java.util.*;
import java.util.stream.Collectors;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> vip = new TreeSet<>();
        Set<String> regular = new TreeSet<>();
        String input = scanner.nextLine();
        while (!input.equals("PARTY")){
            if(Character.isDigit(input.charAt(0))){
                vip.add(input);
            }else{
                regular.add(input);
            }
            input = scanner.nextLine();
        }
        input = scanner.nextLine();
        while (!input.equals("END")){
            if (Character.isDigit(input.charAt(0))) {
                vip.remove(input);
            } else {
                regular.remove(input);
            }
            input =  scanner.nextLine();
        }
        System.out.println(vip.size() + regular.size());
        if(!vip.isEmpty()){
            System.out.println(vip.stream().collect(Collectors.joining(System.lineSeparator())));
        }
        if(!regular.isEmpty()){
            System.out.println(regular.stream().collect(Collectors.joining(System.lineSeparator())));
        }
    }
}