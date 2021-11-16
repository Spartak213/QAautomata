package com.HoneworkLesson4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = {3457, 199, 258, 116, 273, 1999};
        for (int i=0;i< arr.length;i++){
            int min = arr[i];
            int min_i = i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[j]<min){
                    min = arr[j];
                    min_i = j;
                }
            }
            if (i !=min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
