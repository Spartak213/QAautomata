package com.HomeworkLesson3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введи число Х: ");
        int x = input.nextInt();
        System.out.println("Введи число Y: ");
        int y = input.nextInt();
        int FirstNumber;
        int SecondNumber;
        if (x<0) {
            FirstNumber = Math.abs(x);
        }else{
            FirstNumber = x;
        }
        if (y<0){
            SecondNumber = Math.abs(y);
        }else{
            SecondNumber = y;
        }
        if (FirstNumber>SecondNumber){
            System.out.println("Х are biggest then Y");
        }else if(FirstNumber<SecondNumber){
            System.out.println("Y are biggest then Х");
        }else{
            System.out.println("X and Y are equals");
        }
    }
}
