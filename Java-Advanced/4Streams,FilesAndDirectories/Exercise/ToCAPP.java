import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ToCAPP {
    public static void main(String[] args) {
        String filePath = "C://Users//Dani//Desktop//04. Java-Advanced-Files-and-Streams-Exercises-Resources//Exercises Resources//input.txt";
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(filePath))) {
            String line = reader.readLine();
            PrintWriter writer = new PrintWriter("C://Users//Dani//Desktop//04. Java-Advanced-Files-and-Streams-Exercises-Resources//Exercises Resources//output.txt");
            while (line != null) {
                writer.println(line.toUpperCase());
                line = reader.readLine();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
