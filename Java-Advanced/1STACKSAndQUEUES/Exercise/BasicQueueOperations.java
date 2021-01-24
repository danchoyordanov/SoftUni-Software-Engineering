import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = scanner.nextInt();
        int x = scanner.nextInt();
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            queue.offer(scanner.nextInt());
        }
        for (int i = 0; i < s; i++) {
            queue.poll();
        }
        boolean isFound = false;
        if (queue.isEmpty()) {
            System.out.println(0);
            return;
        }
        for (Integer integer : queue) {
            if (integer == x) {
                isFound = true;
                System.out.println(isFound);
                return;
            }
        }
        System.out.println(SmallestNumber(queue));
    }
        public static int SmallestNumber(ArrayDeque<Integer> queue){
        int min = Integer.MAX_VALUE;
        for (Integer integer : queue) {
            if(min>integer){
                min= integer;
            }
        }
        return min;
    }
}
