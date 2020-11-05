package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {

        int rsl = value / 70;

        return rsl;

    }

    public static int rubleToDollar(int value) {

        int rsl = value / 60;

        return rsl;

    }

    public static void main(String[] args) {
        int in1 = 140;
        int in2 = 120;
        int expected1 = 2;
        int expected2 = 2;
        int outEuro = Converter.rubleToEuro(in1);
        boolean passedEuro = expected1 == outEuro;
        int outDollar = Converter.rubleToDollar(in2);
        boolean passedDollar = expected2 == outDollar;
        System.out.println("140 rubles are " + outEuro + " euro.");
        System.out.println("120 rubles are " + outDollar + " dollar.");
        System.out.println("140 rubles are 2. Test result : " + passedEuro);
        System.out.println("120 rubles are 2. Test result : " + passedDollar);

    }

}
