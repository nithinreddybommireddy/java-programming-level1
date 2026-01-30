package com.java.programming.level4;

import java.util.Scanner;

public class FibonacciNthTerm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        sc.close();
        int a = 0, b = 1, nth = 0;

        if (n == 0) {
            System.out.println("Nth Fibonacci number: 0");
            return;
        }
        if (n == 1) {
            System.out.println("Nth Fibonacci number: 1");
            return;
        }
        for (int i = 2; i <= n; i++) {
            nth = a + b;
            a = b;
            b = nth;
        }

        System.out.println("Nth Fibonacci number: " + nth);
    }
}


