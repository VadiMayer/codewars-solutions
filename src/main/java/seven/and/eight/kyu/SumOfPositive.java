package seven.and.eight.kyu;

import java.util.Arrays;

public class SumOfPositive {
    public static int sum(int[] arr){
        return Arrays.stream(arr).filter(e -> e >= 0).sum();
    }
}
