package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int [][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int y = 0; y < size; y++) {
                table[i][y] = (i + 1) * (y + 1);
            }
        }
        return table;
    }

    public static void main(String[] args) {
        int [][] table = multiple(9);
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[3][i]);
        }
    }
}
