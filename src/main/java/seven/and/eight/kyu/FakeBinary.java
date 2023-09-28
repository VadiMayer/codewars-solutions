package seven.and.eight.kyu;

public class FakeBinary {
    public static String fakeBin(String numberString) {
        char[] chars = numberString.toCharArray();
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < chars.length; i++) {
            if (chars[i] < '5') {
                str.append(0);
            } else if (chars[i] >= '5') {
                str.append(1);
            }
        }
        return str.toString();
    }
}
