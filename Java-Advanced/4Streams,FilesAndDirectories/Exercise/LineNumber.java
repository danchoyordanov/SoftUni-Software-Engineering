import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LineNumber {
    public static void main(String[] args) {

        String path = "C://Users//Dani//Downloads//01._Sum Lines_Ресурси//" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources//inputLineNumbers.txt";

        try (BufferedReader reader = Files.newBufferedReader(Paths.get(path))) {
            String line = reader.readLine();
            int n = 0;
            while (line != null) {
                System.out.println(++n + ". " + line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
