import java.util.ArrayList;
import java.util.List;

public class EnoughIsEnough {
    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        List<Integer> photos = new ArrayList<>();
        for (int num : elements) {
            photos.add(num);
        }
        List<Integer> newPhotos = new ArrayList<>();
        for (int i = 0; i < photos.size(); i++) {
            int count = 0;
            if (newPhotos.contains(photos.get(i)) && maxOccurrences >= 1) {
                for (int j = 0; j < photos.size(); j++) {
                    try {
                        if (photos.get(i).equals(newPhotos.get(j))) {
                            count++;

                        } else if (count == maxOccurrences) {
                            break;
                        }
                    } catch (IndexOutOfBoundsException e) {
                        continue;
                    }
                }
            }
            if (count == maxOccurrences) {
                continue;
            }
            newPhotos.add(photos.get(i));
        }
        return newPhotos.stream().mapToInt(i -> i).toArray();
    }
}
