package seven.and.eight.kyu;

import java.util.Arrays;

public class TwoToOne {
    public static String longest (String s1, String s2) {
        StringBuilder str = new StringBuilder();
        str.append(s1);
        str.append(s2);
        Character[] uniqueChars = str.chars()
                .distinct()
                .mapToObj(c -> (char) c)
                .toArray(Character[]::new);
        str.setLength(0);
        Arrays.sort(uniqueChars);
        for(int i = 0; i < uniqueChars.length; i++) {
            str.append(uniqueChars[i]);
        }
        return str.toString();
    }
}
