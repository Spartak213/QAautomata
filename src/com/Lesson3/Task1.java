package com.Lesson3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Сколько сейчас времени: ");
        int time = input.nextInt();
        if (time>18) {
            System.out.print("Good evening");
        }else {
            System.out.print("Good day");
        }
    }
}
