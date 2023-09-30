package seven.and.eight.kyu;

import java.util.Arrays;

public class SquareSum {
    public static int squareSum(int[] n) {
        return Arrays.stream(n).map(num -> (int) Math.pow(num, 2)).sum();
    }
}
