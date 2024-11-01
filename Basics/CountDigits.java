package Basics;

// Problem 1: Write a program to count the digits of a number.

import java.util.Scanner;

public class CountDigits {

    static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
     }
  
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int N = sc.nextInt();
        System.out.println("Your number has " + countDigits(N) + " digits.");
        sc.close();
     }
     
}
