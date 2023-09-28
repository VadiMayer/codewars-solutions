package seven.and.eight.kyu;

public class WhatIsBetween {
    public static int[] between(int a, int b) {
        int size = 0;
        for(int i = a; i <= b; i++) {
            size++;
        }
        int[] numbers = new int[size];
        for(int i = 0; i < size; i++) {
            numbers[i] = a + i;
        }
        return numbers;
    }
}
