package ru.job4j.condition;

public class DummyBot {
    public static void main(String[] args) {
        String rsl = answer("Привет, Бот.");
        System.out.println(rsl);
    }
    public static String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if (question.equals("Привет, Бот.")) {
            rsl = "Привет, умник.";
        } else if (question.equals("Пока.")) {
            rsl = "До скорой встречи.";
        }
        return rsl;
    }
}
