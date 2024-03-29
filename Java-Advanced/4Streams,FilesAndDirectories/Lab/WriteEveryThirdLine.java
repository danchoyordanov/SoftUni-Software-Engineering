import java.io.*;

public class WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("D:\\input.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("out.txt"));
        String line = reader.readLine();
        int lineNumber = 1;
        while (line != null) {

            lineNumber++;
            line = reader.readLine();

            if (lineNumber % 3 == 0) {
                writer.write(line);
                writer.newLine();
            }
        }
        writer.close();
    }
}