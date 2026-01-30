package com.java.programming.level4;

import java.util.Scanner;

public class ArmstrongNum1ToN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();

        int p = (int) Math.log10(n) + 1;

        for (int i = 1; i <= n; i++) {
            int sum = 0;
            int temp = i;
            int temp1 = i;
            while (temp != 0) {
                int rem = temp % 10;
                sum += (int) Math.pow(rem, p);
                temp /= 10;
            }
            if (sum == temp1) {
            }
            System.out.println(" Armstrong numbers upto N :" + temp1);

        }
        sc.close();
    }
}
