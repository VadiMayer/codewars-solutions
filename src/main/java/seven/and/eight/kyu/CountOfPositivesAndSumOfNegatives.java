package seven.and.eight.kyu;

public class CountOfPositivesAndSumOfNegatives {
    public static int[] countPositivesSumNegatives(int[] input) {
        int count = 0;
        int sumNegative = 0;

        if (input == null) {
            return new int[]{};
        } else if (input.length == 0) {
            return new int[]{};
        }

        for(int num: input) {
            if (num < 0) {
                sumNegative += num;
            } else if (num > 0) {
                count++;
            }
        }
        return new int[]{count, sumNegative};
    }
}
