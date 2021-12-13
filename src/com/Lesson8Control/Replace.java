package com.Lesson8Control;

import java.util.Scanner;

public class Replace {

    public String ReplaceLetter(){
        String s1 = GetString();
        if (s1.length()<30){
            String result = s1.replaceAll("[a]","@");
            result = result.replaceAll("[o]","0");
            return result;
        }else{
            return "Your string is too long";
        }
    }

    private String GetString(){
        System.out.println("Write your string please:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
