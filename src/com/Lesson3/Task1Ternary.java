package com.Lesson3;

import java.util.Scanner;

public class Task1Ternary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Сколько сейчас времени: ");
        int time = input.nextInt();
        String securityAnswer = (time > 18) ? "Good evening" : "Good day";
        System.out.println(securityAnswer);
    }
}

