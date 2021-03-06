package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int firstValue = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = firstValue;
        for (int i = 0; i < array.length / 2; i++) {
            int flowValue = array[i];
            int reversTouch = array[array.length - 1 - i];
            array[array.length - i - 1] = flowValue;
            array[i] = reversTouch;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] arrayBack = back(new int[]{1, 2, 3, 4, 5, 6, 7});
        for (int value : arrayBack) {
            System.out.println(value);
        }
    }
}