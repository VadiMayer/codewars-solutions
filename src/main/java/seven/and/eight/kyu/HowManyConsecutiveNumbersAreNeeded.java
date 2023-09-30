package seven.and.eight.kyu;

import java.util.Arrays;
import java.util.stream.IntStream;

public class HowManyConsecutiveNumbersAreNeeded {
    public static void main(String[] args) {
        System.out.println(consecutive(new int[] {5,20,100}));
    }
    public static int consecutive(final int[] arr) {
        int[] arrSorted = Arrays.stream(arr).sorted().toArray();
        if(arr.length != 0) {
            int[] needArray = IntStream.rangeClosed(arrSorted[0], arrSorted[arrSorted.length - 1]).toArray();
            return needArray.length - arrSorted.length;
        }
        return 0;
    }
}
