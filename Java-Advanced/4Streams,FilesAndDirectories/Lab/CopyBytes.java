import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyBytes {
    public static void main(String[] args) {

        try (FileInputStream inputStreamReader = new FileInputStream("D:\\input.txt");) {
            FileOutputStream fileOutputStream = new FileOutputStream("out.txt");
            PrintWriter printWriter = new PrintWriter(fileOutputStream);
            int oneByte = inputStreamReader.read();

            while (oneByte >= 0) {

                if (oneByte == 10 || oneByte == 32) {
                    fileOutputStream.write(oneByte);
                } else {
                    String digits = String.valueOf(oneByte);
                    for (int i = 0; i < digits.length(); i++) {
                        fileOutputStream.write(digits.charAt(i));
                    }
                }
                oneByte = inputStreamReader.read();
            }

        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }
    }
}
