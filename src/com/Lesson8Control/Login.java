package com.Lesson8Control;

import java.util.Scanner;

public class Login{
    private String Login = GetLogin() ;
    private String Password = GetPassword();

    public String LoginPassword() {
        if (Login.equals("admin") && Password.equals("12345")) {
            TaskSelection SelectTasks = new TaskSelection();
            return SelectTasks.SelectTasks();
        }else{
            return "Incorrect login or password";
        }
    }

    private static String GetLogin() {
        System.out.println("Enter login:" );
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static String GetPassword() {
        System.out.println("Enter password:" );
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}