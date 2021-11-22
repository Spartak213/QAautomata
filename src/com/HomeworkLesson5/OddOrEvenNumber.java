package com.HomeworkLesson5;

import java.util.Scanner;

public class OddOrEvenNumber {
    public static void main(String[] args) {
        GetNumberEvenOrOds();
}

    public static int GetIntFromScanner() {
        System.out.println("Get your number please:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static String GetNumberEvenOrOds() {
        String even = ("Even");
        String ods = ("Ods");
        if (GetIntFromScanner() % 2 == 0) {
            System.out.println(even);
            return even;
        } else {
            System.out.println(ods);
            return ods;
        }
    }
}
