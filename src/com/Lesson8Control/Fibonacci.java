package com.Lesson8Control;

public class Fibonacci {
    public String FibNumber(){
        long n0 = 1;
        long n1 = 1;
        long n2;
        String result = "";
        System.out.print(n0+" "+n1+" ");
        for(long i = 3; i <= 49; i++){
            n2=n0+n1;
            n0=n1;
            n1=n2;
            result += n2+" \n ";
        }
        return result;
    }
}
