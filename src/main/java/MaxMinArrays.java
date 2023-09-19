import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//В этой Ката вам будет предоставлен массив уникальных элементов, и ваша задача — переставить значения так,
// чтобы за первым максимальным значением следовало первое минимальное значение, затем второе максимальное
// значение, затем второе минимальное значение и т. д.
public class MaxMinArrays {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(new int[]{9771,9788,5833,9324,96788})));
    }

    public static int[] solve (int[] arr){
        int[] newArray = new int[arr.length];
        int[] takenNum = new int[arr.length];
        List<Integer> numbers = new ArrayList<>();
        int max = 0;
        int indexMax = 0;
        int min = Integer.MAX_VALUE;
        int indexMin = 0;
        try {
            for(int i = 0; i < newArray.length; i = i + 2) {
                for(int j = 0; j < arr.length; j++) {
                    if(max < arr[j]) {
                        if(takenNum[j] == arr[j]) {
                            if (j == arr.length - 1) {
                                takenNum[indexMax] = max;
                            }
                            continue;
                        }
                        max = arr[j];
                        indexMax = j;
                    }
                    if (j == arr.length - 1) {
                        takenNum[indexMax] = max;
                    }
                }
                for(int j = 0; j < arr.length; j++) {
                    if(min > arr[j]) {
                        if(takenNum[j] == arr[j]) {
                            if (j == arr.length - 1) {
                                takenNum[indexMin] = min;
                            }
                            continue;
                        }
                        min = arr[j];
                        indexMin = j;
                    }
                    if (j == arr.length - 1) {
                        takenNum[indexMin] = min;
                    }
                }
                newArray[i] = max;
                newArray[i+1] = min;
                max = 0;
                min = Integer.MAX_VALUE;
            }
        } catch (Exception e) {
            return newArray;
        }
        return newArray;
    }
}
