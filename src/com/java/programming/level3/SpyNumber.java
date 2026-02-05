package com.java.programming.level3;

import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n = sc.nextInt();
        int sum = 0;
        int product = 1;
        while (n != 0) {
            int temp = n % 10;
            sum += temp;
            product *= temp;
            n = n / 10;

            if (sum == product) {
                System.out.println("The given number is spy number ");
            }
        }

    }
}