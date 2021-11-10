package com.Lesson3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String Login = input.next();
        System.out.print("Enter your password: ");
        String Password = input.next();
        if (Login.equals("Yuriy")){
            if (Password.equals("pass")){
                System.out.println("Success");
            }
        } else {
            System.out.println("Error");
        }
    }
}
