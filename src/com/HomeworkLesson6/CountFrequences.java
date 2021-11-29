package com.HomeworkLesson6;

import java.util.Scanner;

public class CountFrequences {
    public static void main(String[] args) {
        System.out.println(countFrequencies());
    }

    public static String getStringFromScanner() {
        System.out.println("Get your string please:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static String countFrequencies(){
        String str = getStringFromScanner();
        int[] freq = new int[str.length()];
        int i, j;
        StringBuilder result = new StringBuilder();

        char[] string = str.toCharArray();

        for(i = 0; i <str.length(); i++) {
            freq[i] = 1;
            for(j = i+1; j <str.length(); j++) {
                if(string[i] == string[j]) {
                    freq[i]++;
                    string[j] = '0';
                }
            }
        }
        for(i = 0; i <freq.length; i++) {
            if(string[i] != ' ' && string[i] != '0')
                result.append(string[i]).append("-").append(freq[i]).append(" ");
        }
        return result.toString();
    }
}
