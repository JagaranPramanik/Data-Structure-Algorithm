package Recursion;

// Problem 1: Print all numbers from 1 to N

import java.util.Scanner;

public class Print1toN {

    static void printToN(int initial, int last) {
        if (initial > last) {
            return;
        }
        System.out.print(initial + " ");
        printToN(initial + 1, last);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: \n");
        int N = sc.nextInt();
        printToN(1, N);
        sc.close();
    }
}
