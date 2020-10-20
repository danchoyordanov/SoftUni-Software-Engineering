import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(" ");
        int counterPrint = 0;
        int counter = 0;
        String elementForPrint = "";
        String currentElement = "";
        for (int i = 0; i < array.length - 1; i++) {

            if (array[i].equals(array[i + 1])) {
                counter++;
                currentElement = array[i];
                if (counter > counterPrint) {
                    counterPrint = counter;
                    elementForPrint = currentElement;
                }
            } else {
                counter = 0;
                currentElement = "";
            }
        }

        for (int i = 0; i <= counterPrint; i++) {
            System.out.print(elementForPrint + " ");
        }
    }
}

