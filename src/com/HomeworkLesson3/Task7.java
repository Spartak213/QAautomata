package com.HomeworkLesson3;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Сумма покупки равна: ");
        int a = input.nextInt();
        int cheap = a - (a/100*15);
        if (a>1000){
            System.out.println("Вам предоставляется скидка 15%. Сумма с учетом скидки: " + cheap);
        }else{
            System.out.println("Скидка не предоставляется");
        }
    }
}