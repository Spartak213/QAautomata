package com.HomeworkLesson3;

import java.util.Scanner;

public class CheckOddEven2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = input.nextInt();
        if (number %2 == 0) {
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }
        System.out.println("BYE");
    }
}
