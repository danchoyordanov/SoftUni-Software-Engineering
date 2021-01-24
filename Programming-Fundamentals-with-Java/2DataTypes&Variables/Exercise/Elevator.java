import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int persons = Integer.parseInt(scanner.nextLine());
        int canHoldTo = Integer.parseInt(scanner.nextLine());
        int courses;
        if(persons % canHoldTo != 0){
            courses = ((int) Math.ceil(persons / canHoldTo)) + 1;
        }else {
            courses = (int) Math.ceil(persons / canHoldTo);
        }
        System.out.println(courses);

    }
}
