package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int left, int right, int middle) {
        int leftToRight = max(left, right);
        int result = leftToRight > middle ? leftToRight : middle;
        return result;
    }

    public static int max(int left, int right, int middle, int last) {
        int leftToRightToMiddle = max(left, right, middle);
        int result = leftToRightToMiddle > last ? leftToRightToMiddle : last;
        return result;
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
