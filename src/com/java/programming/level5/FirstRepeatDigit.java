package com.java.programming.level5;

import java.util.Scanner;

public class FirstRepeatDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        long num = sc.nextLong();
        long temp = num;

        int[] freq = new int[10];

        while (temp > 0) {
            int temp2 = (int) temp % 10;
            freq[(temp2)]++;
            temp /= 10;
        }

        int firstRepeating = -1;

        while (num > 0) {
            int digit = (int) (num % 10);
            if (freq[digit] > 1) {
                firstRepeating = digit;
            }
            num /= 10;
        }

        if (firstRepeating != -1)
            System.out.println("First repeating digit: " + firstRepeating);
        else
            System.out.println("No repeating digit");

        sc.close();
    }
}


