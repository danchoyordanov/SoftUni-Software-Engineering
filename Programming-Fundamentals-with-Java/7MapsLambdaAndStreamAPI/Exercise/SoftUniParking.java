import java.util.*;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,String> data = new LinkedHashMap<>();
        int numberOfCommands = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfCommands; i++) {
            String[] command = scanner.nextLine().split(" ");
            switch (command[0]){
                case "register" :
                    if(data.containsKey(command[1])){
                        System.out.printf("ERROR: already registered with plate number %s%n",data.get(command[1]));
                    }else{
                        data.put(command[1],command[2]);
                        System.out.printf("%s registered %s successfully%n",command[1],command[2]);
                    }
                    break;
                case "unregister" :
                    if(!data.containsKey(command[1])){
                        System.out.printf("ERROR: user %s not found%n",command[1]);
                    }else{
                        data.remove(command[1]);
                        System.out.printf("%s unregistered successfully%n",command[1]);
                    }
                    break;
            }
        }
        data.forEach((k,v)-> System.out.println(k+" => "+v));
    }
}
