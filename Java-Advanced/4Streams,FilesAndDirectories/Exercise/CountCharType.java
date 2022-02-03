import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CountCharType {
    public static void main(String[] args) {

        String path = "C://Users//Dani//Downloads//04. Java-Advanced-Streams-Files-and-Directories-Resources//" +
                "04. Java-Advanced-Files-and-Streams-Lab-Resources//input.txt";
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(path))) {
            String line = reader.readLine();
            int vowels = 0;
            int consonants = 0;
            int punctuation = 0;

            PrintWriter writer = new PrintWriter("C://Users//Dani//Desktop//output.txt");
            while (line != null) {
                for (int i = 0; i < line.length(); i++) {
                    char symbol = line.charAt(i);
                    if (symbol == 'a' || symbol == 'e' || symbol == 'i' ||
                            symbol == 'o' || symbol == 'u') {
                        vowels++;
                    } else if (symbol == '!' || symbol == ',' || symbol == '.' ||
                            symbol == '?') {
                        punctuation++;
                    } else if (symbol != ' ') {
                        consonants++;
                    }
                }
                line = reader.readLine();
            }
            writer.printf("Vowels: %s%nConsonants: %s%nPunctuation: %s%n", vowels, consonants, punctuation);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}