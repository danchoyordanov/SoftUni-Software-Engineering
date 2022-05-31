import java.io.File;


public class GetFolderSize {
    public static void main(String[] args) {
        String path = "C://Users//Dani//Downloads//01._Sum Lines_Ресурси (1)//" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources//Exercises Resources";
        File folder = new File(path);
        long size = getFolderSize(folder);
        System.out.printf("Folder size: %d", size);
    }

    public static long getFolderSize(File folder) {
        long length = 0;

        File[] files = folder.listFiles();

        int count = files.length;

        for (int i = 0; i < count; i++) {
            if (files[i].isFile()) {
                length += files[i].length();
            } else {
                length += getFolderSize(files[i]);
            }
        }
        return length;
    }
}
