package Recursion;

// Problem 2: Print all numbers from N to 1

import java.util.Scanner;

public class PrintNto1 {

    // Backtracking
    static void printTo1(int last, int initial) {
        if (last < initial) {
            return;
        }
        printTo1(last, initial + 1);
        System.out.print(initial + " ");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: \n");
        int N = sc.nextInt();
        printTo1(N, 1);
        sc.close();
    }
}
