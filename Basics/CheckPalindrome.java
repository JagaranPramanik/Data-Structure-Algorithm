package Basics;

// Problem 3: Write a program to check whether a number is palindrome.

import java.util.Scanner;

public class CheckPalindrome {
    
    static boolean checkPalindrome(int num) {
        int temp = num;
        int reverseNum = 0;
            while (num > 0) {
                int lastDigit = num % 10;
                reverseNum = reverseNum * 10 + lastDigit;
                num /= 10;
            }
            return reverseNum == temp;
        }
  
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int N = sc.nextInt();
        System.out.println(checkPalindrome(N));
        sc.close();
     }
     
}
