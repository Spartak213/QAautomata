package com.HomeworkLesson3;

import java.util.Scanner;

public class GreatestValue4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введи число Х: ");
        int x = input.nextInt();
        System.out.println("Введи число Y: ");
        int y = input.nextInt();
        if (x > y){
            System.out.println("The number X has the greatest value");
        }else if (x < y){
            System.out.println("The number Y has the greatest value");
        }else {
            System.out.println("They are equal");
        }
    }
}
