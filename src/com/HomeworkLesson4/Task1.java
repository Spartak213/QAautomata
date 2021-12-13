package com.HomeworkLesson4;

public class Task1 {
    public static void main(String[] args) {
        int[] arr= {1, 2, 3, 4, 2, 7, 8, 8, 3};
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[j] == arr[i]){
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
