package ru.job4j.array;

public class SwitchArray {

    public static int[] swap(int[] array, int source, int dest) {
        int sourceArray = array[source];
        int destArray = array[dest];
        array[source] = destArray;
        array[dest] = sourceArray;
        return array;
    }

    public static int[] swapBorder(int[] array) {
        int firstItem = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = firstItem;
        return array;
    }

    public static void main(String[] args) {
        int[] numbers = new int[] {1, 2, 3, 4, 5, 6};
        int[] result = swapBorder(numbers);
        for (int index = 0; index < rsl.length; index++) {
            System.out.println(rsl[index]);
        }
    }
}
