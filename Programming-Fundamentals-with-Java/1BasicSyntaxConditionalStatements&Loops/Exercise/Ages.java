import java.util.Scanner;

public class Ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        String type ;
        if(0 <= age && age <=2 ){
            type = "baby";
        }else if(2 < age && age <=13){
            type = "child";
        }else if(13 < age && age <= 19 ){
            type = "teenager";
        }else if(19 < age && age <= 65){
            type = "adult";
        }else {
            type = "elder";
        }
        System.out.println(type);
    }
}

