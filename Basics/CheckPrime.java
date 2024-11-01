package Basics;

// Problem 6: Write a program to check whether a number is prime.

import java.util.Scanner;

public class CheckPrime {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int N = sc.nextInt();
        System.out.println(isPrime(N));
        sc.close();
    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        int count = 0;
        for (int i = 2; i*i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        return count == 0;
    }

}
