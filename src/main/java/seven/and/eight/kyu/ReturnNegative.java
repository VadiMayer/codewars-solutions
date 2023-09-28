package seven.and.eight.kyu;

public class ReturnNegative {
    public static int makeNegative(final int x) {
        if(x > 0) {
            return -x;
        } else if (x < 0) {
            return x;
        } else
            return 0;

    }
}
