package Basics;

// Problem 4: Write a program to check whether a number is Armstrong number.

import java.util.Scanner;

public class ArmstrongNumber {
    
    static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
     }

    static boolean isArmstrong(int num) {
        int temp = num;
        int sum = 0;
        int digits = countDigits(temp);
        while (num > 0) {
            int lastDigit = num % 10;
            sum += Math.pow(lastDigit, digits);
            num /= 10;
        }
        return sum == temp;
     }
  
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int N = sc.nextInt();
        System.out.println(isArmstrong(N));
        sc.close();
     }

}
