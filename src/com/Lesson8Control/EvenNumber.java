package com.Lesson8Control;

import java.util.Scanner;

public class EvenNumber{

    public String GetNumberEvenOrOds() {
        String even = ("Even Number");
        String ods = ("Ods Number");
        if (GetIntFromScanner() % 2 == 0) {
            return even;
        } else {
            return ods;
        }
    }

    public static int GetIntFromScanner() {
        System.out.println("Write your number please:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
