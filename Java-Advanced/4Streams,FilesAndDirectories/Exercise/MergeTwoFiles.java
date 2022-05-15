import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MergeTwoFiles {
    public static void main(String[] args) {
        String fileOne = "C://Users//Dani//Downloads//01._Sum Lines_Ресурси (1)//" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources//inputOne.txt";

        String fileTwo = "C://Users//Dani//Downloads//" +
                "01._Sum Lines_Ресурси (1)//04. Java-Advanced-Files-and-Streams-Exercises-Resources//inputTwo.txt";

        try (BufferedReader reader1 = Files.newBufferedReader(Paths.get(fileOne))) {
            BufferedReader reader2 = Files.newBufferedReader(Paths.get(fileTwo));
            String lineOne = reader1.readLine();
            String lineTwo = reader2.readLine();

            PrintWriter writer = new PrintWriter("C://Users//Dani//Desktop//output.txt");
            while (lineOne != null) {
                writer.printf("%s%n",lineOne);
                lineOne = reader1.readLine();
            }
            while (lineTwo != null) {
                writer.printf("%s%n",lineTwo);
                lineTwo = reader2.readLine();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
