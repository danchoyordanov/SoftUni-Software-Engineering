import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class SortLines {
    public static void main(String[] args) throws IOException {

        List<String> lines = Files.readAllLines(Paths.get("D:\\input.txt"))
                .stream()
                .sorted(String::compareTo)
                .collect(Collectors.toList());


        Files.write(Paths.get("out.txt"), lines, Charset.defaultCharset());
    }
}