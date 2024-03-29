package IOUtils;

import java.util.Arrays;

public class InputParser {

    public static int[] parseArray(String input, String pattern) {
        return Arrays.stream(input.split(pattern))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
