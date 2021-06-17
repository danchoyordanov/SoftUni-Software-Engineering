import java.io.File;

public class ListFiles {
    public static void main(String[] args) {

        String fileName = "D:/Files-and-Streams";
        File file = new File(fileName);

        File[] innerFiles = file.listFiles();

        for (File innerFile : innerFiles) {
            if(! innerFile.isDirectory() ){
                System.out.printf("%s: [%d]%n",innerFile.getName(),innerFile.length());
            }
        }

    }
}
