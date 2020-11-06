package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println("ages length = " + ages.length);
        System.out.println("surnames length = " + surnames.length);
        System.out.println("prices length = " + prices.length);
        String[] names = new String[4];
        names[0] = "One";
        names[1] = "Two";
        names[2] = "Three";
        names[3] = "Four";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
