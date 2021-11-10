package com.HomeworkLesson2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите массу тела в фунтах: ");
        double Pounds = input.nextDouble();
        System.out.print("Введите свой рост в дюймах: ");
        double inches = input.nextDouble();
        double m = Pounds/2.205;
        double l = inches/39.37;
        double BMI = m/Math.pow(l,2);
        System.out.println("Ваш индекс массы тела равен: " + BMI);
    }
}
