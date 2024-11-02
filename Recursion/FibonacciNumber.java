package Recursion;

// Problem 7: Find the Nth Fibonacci number using recursion

import java.util.Scanner;

public class FibonacciNumber {

    static int fibo(int n) {
        if (n <= 1) {
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int N = sc.nextInt();
        System.out.println(N + "th Fibonacci number is: " + fibo(N));
        sc.close();
    }
}
