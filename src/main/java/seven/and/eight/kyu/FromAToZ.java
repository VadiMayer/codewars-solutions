package seven.and.eight.kyu;

public class FromAToZ {
    public static String gimmeTheLetters(String s){
        String[] arrayStr = s.split("-");
        StringBuilder lettersInLine = new StringBuilder();
        int start = (int) arrayStr[0].charAt(0);
        int end = (int) arrayStr[1].charAt(0);
        for(int i = start; i <= end; i++) {
            lettersInLine.append((char) i);
        }
        return lettersInLine.toString();
    }
}
