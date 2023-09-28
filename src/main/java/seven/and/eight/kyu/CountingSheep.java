package seven.and.eight.kyu;

public class CountingSheep {
    static int countSheeps(Boolean[] arrayOfSheeps) {
        int count = 0;
        for(int i = 0; i < arrayOfSheeps.length; i++) {
            if (arrayOfSheeps[i] == null) {
                continue;
            }
            if (arrayOfSheeps[i]) {
                count++;
            } else
                continue;
        }
        return count;
    }
}
