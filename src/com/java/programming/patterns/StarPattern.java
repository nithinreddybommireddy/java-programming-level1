package com.java.programming.patterns;

import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N:");
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j < n - i + 1; j++) {
                System.out.print("* ");
            }
            for (int k = 1; k <= i * 2; k++) {
                System.out.print(" ");
            }

            for (int l = 1; l <= i * 2; l++) {
                System.out.print(" ");
            }

            for (int m = n; m > i; m--) {
                System.out.print("* ");
            }

            System.out.println();
        }
        sc.close();
    }
}
