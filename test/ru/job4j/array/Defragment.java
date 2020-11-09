package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        int [] frame = new int[array.length];
        for (int y = 0; y < array.length; y++) {
            frame[y] = y;
        }
        int pointNotNull = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index; /* указатель на null ячейку. */
                /* переместить первую не null ячейку. Нужен цикл. */
                for (int y = index; y < array.length; y++) {
                    if (array[y] != null) {
                        //pointNotNull = y;
                        SwitchArray.swap(frame, y, point);
                    }
                }
            }
            //System.out.print(array[index] + " ");
        }
        for (int q = 0; q < frame.length; q++ ) {
            System.out.println(frame[q]);
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        //0, 2, 4, 6,
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}