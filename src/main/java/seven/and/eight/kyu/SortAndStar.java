package seven.and.eight.kyu;

import java.util.Arrays;

public class SortAndStar {
    public static String twoSort(String[] s) {
        Arrays.sort(s);
        String findFirst = (String) Arrays.stream(s).findFirst().get();
        char[] chars = findFirst.toCharArray();
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < chars.length; i++) {
            if (i == 0) {
                str.append(chars[i]);
                continue;
            }
            str.append("***" + chars[i]);
        }
        return str.toString();
    }
}
