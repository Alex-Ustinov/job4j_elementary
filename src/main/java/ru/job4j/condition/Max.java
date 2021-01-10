package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int left, int right, int middle) {
        return max(max(left, right), middle);
    }

    public static int max(int left, int right, int middle, int last) {
        return max(max(max(left, right), middle), last);
    }


    public static void main(String[] args) {
       int rsl = max(42, 5);
       System.out.println(rsl);
        int rsl1 = max(2, 73, 8);
        System.out.println(rsl1);
        int rsl2 = max(142, 2, 33, 155);
        System.out.println(rsl2);
    }
}
