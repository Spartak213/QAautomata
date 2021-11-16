package com.HoneworkLesson4;

public class Task5 {
    public static void main(String[] args) {
        String s1 = "gnirtStsriF";
        char[] charArray = new char[s1.length()];
        for (int i = 10; i >= 0; i--) {
            charArray[i] = s1.charAt(i);
            System.out.print(charArray[i]);
        }
    }
}
