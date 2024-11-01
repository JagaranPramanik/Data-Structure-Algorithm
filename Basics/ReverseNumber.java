package Basics;

// Problem 2: Write a program to reverse a number.

import java.util.Scanner;

public class ReverseNumber {

    static int reverseNumber(int num) {
        int result = 0;
            while (num > 0) {
                int lastDigit = num % 10;
                result = result * 10 + lastDigit;
                num /= 10;
            }
            return result;
        }
  
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int N = sc.nextInt();
        System.out.println("Reversed number is " + reverseNumber(N));
        sc.close();
     }
     
}