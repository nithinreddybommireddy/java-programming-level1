package com.java.programming.level4;

import java.util.Scanner;

public class DigitalRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        while (n >= 10) { // repeat until single digit
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            n = sum;
        }

        System.out.println("Digital Root: " + n);
    }
}


