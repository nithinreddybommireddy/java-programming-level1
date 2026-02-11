package com.java.programming.level2;

import java.util.Scanner;

public class LargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n = sc.nextInt();
        int largestDigit = 0;

        while (n != 0) {
            int temp = n % 10;
            if (temp > largestDigit) {
                largestDigit = temp;
            }
            n = n / 10;
        }
        System.out.println("Largest digit is :" + largestDigit);
        sc.close();

    }
}
