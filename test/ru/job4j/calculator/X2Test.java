package ru.job4j.calculator;

import org.junit.Test;

import org.junit.Assert;

public class X2Test {

    @Test
    public void whenA10B9C0X2Then40() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 3;
        int rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);

        
        int a1 = 1;
        int b1 = 0;
        int c1 = 1;
        int x1 = 1;
        int expected1 = 2;
        int rsl1 = X2.calc(a1, b1, c1, x1);
        Assert.assertEquals(expected1, rsl1);

        int a2 = 1;
        int b2 = 1;
        int c2 = 0;
        int x2 = 1;
        int expected2 = 2;
        int rsl2 = X2.calc(a2, b2, c2, x2);
        Assert.assertEquals(expected2, rsl2);

        int a3 = 1;
        int b3 = 1;
        int c3 = 1;
        int x3 = 0;
        int expected3 = 1;
        int rsl3 = X2.calc(a3, b3, c3, x3);
        Assert.assertEquals(expected3, rsl3);
    }
}