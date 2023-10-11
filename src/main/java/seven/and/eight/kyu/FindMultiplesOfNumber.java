package seven.and.eight.kyu;

import java.util.stream.IntStream;

public class FindMultiplesOfNumber {
    public static int[] find(int base, int limit) {
        return IntStream.rangeClosed(base, limit).filter(e -> e % base == 0).toArray();
    }
}
