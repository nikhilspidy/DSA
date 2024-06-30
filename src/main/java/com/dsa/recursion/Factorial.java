package com.dsa.recursion;

import java.util.Scanner;


/**
 This program will find factorial of given number
 */
public class Factorial {
    public static void main(String[] args) {

        System.out.println("Enter number : ");
        System.out.println(fact(new Scanner(System.in).nextInt(), 1));
    }

    private static int fact(int number, int answer) {
        if (number == 1 || number == 0)
            return answer;

        return fact(number - 1, answer * number);
    }
}
