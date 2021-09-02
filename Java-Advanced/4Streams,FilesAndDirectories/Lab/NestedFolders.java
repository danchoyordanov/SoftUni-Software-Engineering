import java.io.File;
import java.util.ArrayDeque;
import java.util.Deque;

public class NestedFolders {


    public static void main(String[] args) {
        String fileName = "C:\\Users\\Dani\\Downloads\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\" +
                "04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams";
        File file = new File(fileName);

        Deque<File> directories = new ArrayDeque<>();
        directories.offer(file);

        int count = 0;
        while (!directories.isEmpty()) {
            File currentFile = directories.poll();
            File[] nestedFiles = currentFile.listFiles();

            for (File nestedFile : nestedFiles) {
                if (nestedFile.isDirectory()) {
                    directories.offer(nestedFile);
                }

            }
            count++;
            System.out.println(currentFile.getName());
        }
        System.out.println(count + " folders");

    }
}