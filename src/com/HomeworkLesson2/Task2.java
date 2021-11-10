package com.HomeworkLesson2;

public class Task2 {
    public static void main(String[] args) {
        int Minutes = 3456789;
        double MinutesInYear = 60 * 24 * 365;
        int years = (int) (Minutes/MinutesInYear);
        int days = (Minutes / 60 / 24) % 365;
        System.out.println(Minutes + " минут" + " это " + years + " лет " + days + " дней");
    }
}