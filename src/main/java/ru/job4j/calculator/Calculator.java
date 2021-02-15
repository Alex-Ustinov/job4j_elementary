package ru.job4j.calculator;

import java.io.FileOutputStream;

public class Calculator {
    public static void main(String[] args) {
        int two = 2;
        int six = 6;
        int four = 4;
        int five = 5;
        int sixDivTwo = six / two;
        int fiveMinusTwo = five - two;
        int fourTimeTwo = four * two;
        System.out.println("sixDivTwo = " + sixDivTwo);
        System.out.println("fiveMinusTwo = " + fiveMinusTwo);
        System.out.println("fourTimeTwo = " + fourTimeTwo);
        try (FileOutputStream out = new FileOutputStream("result.txt")) {
            out.write((sixDivTwo + " " + fiveMinusTwo + " " + fourTimeTwo + " ").getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
