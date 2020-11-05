package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        int argX = x2 - x1;
        int argY = y2 - y1;
        double extentX = Math.pow(argX, 2);
        double extentY = Math.pow(argY, 2);
        double extentSumXY = extentX + extentY;
        double rsl = Math.sqrt(extentSumXY);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
