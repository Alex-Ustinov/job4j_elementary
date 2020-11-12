package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        boolean firstElement = data[0];
        for (int i = 1; i < data.length; i++) {
            if (firstElement != data[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
