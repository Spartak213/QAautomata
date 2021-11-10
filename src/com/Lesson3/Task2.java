package com.Lesson3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Какой сегодня день недели? ");
        int day = input.nextInt();
        switch (day) {
            case 1:
                System.out.println("Now is a Monday");
                break;
            case 2:
                System.out.println("Now is a Tuesday");
                break;
            case 3:
                System.out.println("Now is a Wednesday");
                break;
            case 4:
                System.out.println("Now is a Thursday");
                break;
            case 5:
                System.out.println("Now is a Friday");
                break;
            case 6:
                System.out.println("Now is a Saturday");
                break;
            case 7:
                System.out.println("Now is a Sunday");
                break;
            default:
                System.out.println("Так не бывает");
        }
    }
}
