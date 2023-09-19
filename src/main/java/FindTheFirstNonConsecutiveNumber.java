
//Ваша задача состоит в том, чтобы найти первый элемент массива, который не является последовательным.
//Под "не последовательным" мы подразумеваем не совсем на 1 больше, чем предыдущий элемент массива.
//Например. Если у нас есть массив [1,2,3,4,6,7,8], то 1, затем 2, затем 3, затем 4 являются последовательными,
// но 6 - нет, так что это первое непоследовательное число.
//Если весь массив является последовательным, то верните null2.
//Массив всегда будет содержать по крайней мере 2 элемента1, и все элементы будут числами.
// Все номера также будут уникальными и расположены в порядке возрастания. Числа могут быть положительными
// или отрицательными, и первое непоследовательное число тоже может быть любым!

public class FindTheFirstNonConsecutiveNumber {
    static Integer find(final int[] array) {
        try {
            for(int i = 0; i < array.length; i++) {
                if (array[i] + 1 == array[i + 1]) {
                    continue;
                } else {
                    return array[i+1];
                }
            }
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
        return null;
    }
}
