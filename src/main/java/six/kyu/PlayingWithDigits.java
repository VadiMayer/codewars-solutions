package six.kyu;

//Некоторые числа обладают забавными свойствами. Например:
//89 --> 8¹ + 9² = 89 * 1
//695 --> 6² + 9³ + 5⁴= 1390 = 695 * 2
//46288 --> 4³ + 6⁴+ 2⁵ + 8⁶ + 8⁷ = 2360688 = 46288 * 51
//Дано положительное целое число n, записанное как abcd... (a, b, c, d... - цифры) и
// положительное целое число p
//мы хотим найти положительное целое число k, если оно существует, такое, чтобы сумма цифр числа n,
// взятых в последовательных степенях p, была равна k * n.
//Другими словами:
//Существует ли целое число k, такое как: (a ^ p + b ^ (p + 1) + c ^ (p + 2) + d ^ (p + 3) + ...) = n * k
//Если это так, мы вернем k, если нет, вернем -1.
//Примечание: n и p всегда будут задаваться как строго положительные целые числа.
public class PlayingWithDigits {
    public static long digPow(int n, int p) {
        String num = String.valueOf(n);
        char[] chars = num.toCharArray();
        int pow = p;
        int result = 0;
        long k = -1;

        for (char aChar : chars) {
            result += (int) Math.pow(Double.parseDouble(String.valueOf(aChar)), (pow++));
            if (result % n == 0) {
                k = result / n;
                return k;
            }
        }
        return k;
    }
}
