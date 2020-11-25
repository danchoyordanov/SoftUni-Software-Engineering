import java.util.*;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String file = s.substring(s.lastIndexOf("\\")+ 1);
        String name = file.substring(0,file.indexOf("."));
        String extension = file.substring(file.indexOf(".")+1);
        System.out.println("File name: "+name);
        System.out.println("File extension: "+extension);
    }
}
