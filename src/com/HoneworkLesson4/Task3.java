package com.HoneworkLesson4;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = {3457, 199, 258, 116, 273, 1999};
        int min = arr[0];
        for (int i = 0;i < arr.length;i ++){
            if(arr[i]<min) {
                min = arr[i];
            }
        }
        System.out.println("Min is " + min);
    }
}
