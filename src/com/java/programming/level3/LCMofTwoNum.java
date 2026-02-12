package com.java.programming.level3;

import java.util.Scanner;

public class LCMofTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNum = sc.nextInt();
        System.out.print("Enter second number: ");
        int secondNum = sc.nextInt();
        int max;
        if(firstNum > secondNum)
             max=firstNum;
        else
             max= secondNum;

        while (true) {
            if (max % firstNum == 0 && max % secondNum == 0) {
                System.out.println("LCM = " + max);
                break;
            }
            max++;
        }
        sc.close();
    }
}



