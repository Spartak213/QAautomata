package com.HomeworkLesson5;

public class SumOfArray {
    public static void main(String[] args) {
        int[] intArray = {20, 2, 4, 14};
        System.out.println(GetArrayLength(intArray));
    }

    public static int GetArrayLength(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }
}
