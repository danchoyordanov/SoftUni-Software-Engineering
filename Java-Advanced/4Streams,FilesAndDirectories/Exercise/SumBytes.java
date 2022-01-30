import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SumBytes {
    public static void main(String[] args) {
        String filePath = "C://Users//Dani//Desktop//04. Java-Advanced-Files-and-Streams-Exercises-Resources//Exercises Resources//input.txt";

        try (BufferedReader reader = Files.newBufferedReader(Paths.get(filePath))) {
            String line = reader.readLine();
            long sumCount = 0;
            while (line != null) {
                for (int c : line.toCharArray()) {
                    sumCount += c;
                }
                line = reader.readLine();
            }
            System.out.println(sumCount);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
