package com.eldus;

public class Calculator {
    public static int plus(int[] arr){
        int sum = 0;
        for(int a : arr){
            sum += a;
        }
        return sum;
    }
}
