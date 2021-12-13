package com.HomeworkLesson7;

import static com.HomeworkLesson7.FractionNumbers.*;

public class App {
    public static void main(String[] args) {
        double firstNumber = getIntFromScanner();
        double secondNumber = getIntFromScanner();
        String method = getStringFromScanner();
        FractionNumbers fractionNumbers = new FractionNumbers(firstNumber, secondNumber, method);
        System.out.println(fractionNumbers.toString());
    }
}