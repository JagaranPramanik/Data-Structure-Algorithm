package Basics;

// Problem 7: Find the GCD or HCF of two numbers.

import java.util.Scanner;

// Euclidean Algorithm
public class FindGCD {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter another number: ");
        int num2 = sc.nextInt();
        System.out.println("GCD of the numbers: " + findGCD(num1, num2));
        sc.close();
    }

    static int findGCD (int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            }
            else {
                b = b % a;
            }
        }
        if (a == 0) {
            return b;
        }
        return a;
    }
}
