import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

public class WriteТoFile {
    public static void main(String[] args) {

        String path = "D:\\input.txt";
        try (FileInputStream inputStream = new FileInputStream(path)) {
            FileOutputStream outputStream = new FileOutputStream("out.txt");


            int singleByte = inputStream.read();

            Set<Character> punctuation = new HashSet<>();
            punctuation.add(',');
            punctuation.add('.');
            punctuation.add('!');
            punctuation.add('?');
            while (singleByte >= 0) {
                char symbol = (char) singleByte;

                if (!punctuation.contains(symbol)) {
                    outputStream.write(symbol);
                }
                singleByte = inputStream.read();
            }
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }
    }
}
