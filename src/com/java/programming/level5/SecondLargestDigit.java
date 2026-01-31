package com.java.programming.level5;

import java.util.Scanner;

public class SecondLargestDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        long num = sc.nextLong();

        int largest = -1;
        int secondLargest = -1;

        while (num > 0) {
            int digit = (int) (num % 10);

            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit < largest && digit > secondLargest) {
                secondLargest = digit;
            }

            num /= 10;
        }

        if (secondLargest != -1)
            System.out.println("Second largest digit: " + secondLargest);
        else
            System.out.println("Second largest digit not found");

        sc.close();
    }
}


