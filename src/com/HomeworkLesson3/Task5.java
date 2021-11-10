package com.HomeworkLesson3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите a: ");
        double a = input.nextInt();
        System.out.println("Введите b: ");
        double b = input.nextInt();
        double x = -b/a;
        if (a == 0){
            System.out.println("На ноль делить нельзя");
        }else{
            System.out.println(x);
        }
    }
}
