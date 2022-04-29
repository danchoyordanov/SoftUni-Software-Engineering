import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WordCount {
    public static void main(String[] args) {


        String pathWords = "C://Users//Dani//Downloads//01._Sum Lines_Ресурси//" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources//words.txt";

        String pathText = "C://Users//Dani//Downloads//01._Sum Lines_Ресурси//" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources//Exercises Resources//text.txt";

        try (BufferedReader reader = Files.newBufferedReader(Paths.get(pathWords))) {
            BufferedReader reader1 = Files.newBufferedReader(Paths.get(pathText));

            String[] words = new String[3];
            words = reader.readLine().split(" ");
            String[] text = reader1.readLine().split(" ");
            PrintWriter writer = new PrintWriter("C://Users//Dani//Desktop//output.txt");
            int n1 = 0;
            int n2 = 0;
            int n3 = 0;
            for (int i = 0; i < words.length; i++) {
                for (int j = 0; j < text.length; j++) {
                    if (text[j].equals(words[i]) && i == 0) {
                        n1++;
                    } else if (text[j].equals(words[i]) && i == 1) {
                        n2++;
                    } else if (text[j].equals(words[i]) && i == 2) {
                        n3++;
                    }
                }
            }
            writer.printf("%s - %d%n" +
                    "%s - %d%n" +
                    "%s - %d%n", words[0], n1, words[1], n2, words[2], n3);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}