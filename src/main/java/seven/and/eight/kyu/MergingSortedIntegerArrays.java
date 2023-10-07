package seven.and.eight.kyu;

import java.util.Arrays;
import java.util.stream.Stream;

public class MergingSortedIntegerArrays {
    public static int[] mergeArrays(int[] first, int[] second) {
        return Stream.concat(Arrays.stream(first).boxed(), Arrays.stream(second).boxed())
                .distinct().mapToInt(o -> (int) o)
                .sorted()
                .toArray();
    }
}
