package com.java.programming.level4;

import java.util.Scanner;

public class SumOfDigitsIsEven {
    static boolean isEvenDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        sc.close();

        System.out.println("Numbers whose sum of digits is even:");
        for (int i = 1; i <= n; i++) {
            if (isEvenDigitSum(i)) {
                System.out.print(i + " ");
            }
        }
    }
}


