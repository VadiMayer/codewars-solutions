package seven.and.eight.kyu;

import java.util.stream.IntStream;

public class FindTheSmallestIntegerInTheArray {
    public static int findSmallestInt(int[] args) {
        return IntStream.of(args).min().orElse(0);
    }
}
