package com.java.programming.level4;

import java.util.Scanner;

public class OddDigitProductNumbers {
    static boolean isOddDigitProduct(int num) {
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        sc.close();

        System.out.println("Numbers whose product of digits is odd:");
        for (int i = 1; i <= n; i++) {
            if (isOddDigitProduct(i)) {
                System.out.print(i + " ");
            }
        }
    }
}


