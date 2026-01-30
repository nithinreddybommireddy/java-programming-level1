package com.java.programming.level4;

import java.util.Scanner;

public class NumberSeries1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        int temp=0;
        sc.close();
        for (int i = 1; i <= n; i++) {
             temp = i*i;
            System.out.print(temp + " ");

        }

    }

}
