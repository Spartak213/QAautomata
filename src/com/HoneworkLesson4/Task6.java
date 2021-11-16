package com.HoneworkLesson4;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        int January = 1;
        int February = 2;
        int March = 3;
        int April = 4;
        int May = 5;
        int June = 6;
        int Jule = 7;
        int August = 8;
        int September = 9;
        int October = 10;
        int November = 11;
        int December = 12;
        int[] FirstQuarter = {December,January,February};
        int[] SecondQuarter = {March,April,May};
        int[] ThirdQuarter = {June,Jule,August};
        int[] FourthQuarter = {September,October,November};
        Scanner input = new Scanner(System.in);
        System.out.println("Write noumber of month: ");
        int month = input.nextInt();
        //switch ()
        System.out.println(month);
    }
}
