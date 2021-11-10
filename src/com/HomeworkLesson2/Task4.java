package com.HomeworkLesson2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Какую дистанцию вы преодолели: ");
        double Meters = input.nextInt();
        System.out.print("Сколько прошло часов: ");
        double Hours = input.nextInt();
        System.out.print("Сколько прошло минут: ");
        double min = input.nextInt();
        System.out.print("Сколько прошло cекунд: ");
        double sec = input.nextInt();
        double metersPerSec = Meters / (Hours * 3600 + (min * 60) + sec);
        double khPerHour = (Meters / 1000) / (Hours + (min / 60) + (sec / 3600));
        System.out.println("Ваша скорость в м/с равна: " + metersPerSec + "; Ваша скорость в км/час равна: " + khPerHour);
    }
}