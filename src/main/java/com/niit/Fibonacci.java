package com.niit;

import java.util.Scanner;

class Fibonacci {
   public static int fibonacciSeries(int n) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int n = scanner.nextInt();
        int firstTerm = 0, secondTerm = 1;

        System.out.println("Fibonacci Series Upto " + n + ": ");
        int nextTerm = 0;
        while (firstTerm <= n) {
            System.out.print(firstTerm + ", ");
            nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;

        }
        return nextTerm;
    }
}