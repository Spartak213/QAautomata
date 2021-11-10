package com.HomeworkLesson3;

import java.util.Scanner;

public class CheckPassFail1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Введите число: ");
        int mark = input.nextInt();
        if (mark >= 50){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
        System.out.println("DONE");
    }
}
