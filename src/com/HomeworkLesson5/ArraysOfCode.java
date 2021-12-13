package com.HomeworkLesson5;

import java.util.Arrays;

public class ArraysOfCode {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(ArraysValueToCodes(arr));
    }

    public static String ArraysValueToCodes(int[] arr) {
        String name = "";
        int[] ascii = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            name += arr[i];
        }
        int NameLenghth = name.length();

        for (int i = 0; i < NameLenghth; i++) {
            char character = name.charAt(i);
            ascii[i] = character;
        }
        return (Arrays.toString(ascii));
    }
}