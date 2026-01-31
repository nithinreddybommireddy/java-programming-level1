package com.java.programming.level5;

import java.util.Scanner;

public class IncreasingOrder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();

        int prevDigit = 10;
        boolean increasing = true;

        while (num > 0) {
            int digit = num % 10;

            if (digit >= prevDigit) {
                increasing = false;
                break;
            }

            prevDigit = digit;
            num /= 10;
        }

        if (increasing)
            System.out.println("Digits are in increasing order");
        else
            System.out.println("Digits are NOT in increasing order");

        sc.close();
    }
}


