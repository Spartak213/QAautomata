package com.Lesson8Control;

import java.util.Scanner;

public class TaskSelection {
    public String SelectTasks(){
        int number = getIntFromScanner();
        switch(number) {
            case 1:
                EvenNumber GetNumberEvenOrOds = new EvenNumber();
                return GetNumberEvenOrOds.GetNumberEvenOrOds();
            case 2:
                ArmstrongNumber GetArmstrongNumber = new ArmstrongNumber();
                return GetArmstrongNumber.GetArmstrongNumber();
            case 3:
                Reverse ReverseString = new Reverse();
                return ReverseString.ReverseString();
            case 4:
                Fibonacci FibNumber = new Fibonacci();
                return FibNumber.FibNumber();
            case 5:
                Replace ReplaceLetter = new Replace();
                return ReplaceLetter.ReplaceLetter();
            default:
                return "This task does not exist";
        }
    }

    private int getIntFromScanner() {
        System.out.println("What are you need?:\n 1. Even Number \n 2. Armstrong number\n 3. Reverse string\n 4. Fibonacci number \n 5. Replace letter" );
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}

