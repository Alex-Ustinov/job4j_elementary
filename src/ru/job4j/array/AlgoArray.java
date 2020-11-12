package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        for (int i = 1; i < array.length; i++) {
            int temp = array[0];
            if (temp < array[i]) {
                array[i] = temp;
            }
        }
        for (int y = 0; y < array.length; y++) {
            System.out.println(array[y]);
        }
    }
}
