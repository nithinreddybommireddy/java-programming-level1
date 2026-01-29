package com.java.programming.level5;

import java.util.Scanner;

public class PowerOf2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        if (n > 0) {
            while (n % 2 == 0) {
                n /= 2;
            }
            if (n == 1)
                System.out.println("Power of 2");
            else
                System.out.println("Not a power of 2");
        }


    }
}



