package com.Lesson8Control;

import java.util.Scanner;

public class Reverse {

    public String ReverseString() {
        String s1 = GetString();
        char ch[]=s1.toCharArray();
        String reverse="";
        for(int i=ch.length-1;i>=0;i--){
            reverse+=ch[i];
        }
        return reverse;
    }

    private String GetString() {
        System.out.println("Write your string please:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
