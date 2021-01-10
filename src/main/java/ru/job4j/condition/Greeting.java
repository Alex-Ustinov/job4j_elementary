package ru.job4j.condition;

import java.time.LocalDate;

public class Greeting {
    public static void main(String[] args) {
        String idea = "I like Java!";
        System.out.println(idea);
        idea = idea + " But I am a newbie.";
        System.out.println(idea);
        LocalDate date = LocalDate.now();
        int year = date.getYear();
        idea = idea + " " + year;
        System.out.println(idea);
    }
}
