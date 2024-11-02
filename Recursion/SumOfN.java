package Recursion;

// Problem 3: Print sum of first N numbers

import java.util.Scanner;

public class SumOfN {
    
    static int sumOfNumbers (int num) {
        if (num == 0) {
            return 0;
        }
        return num + sumOfNumbers(num - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: \n");
        int N = sc.nextInt();
        System.out.println("Sum of first " + N + " numbers is " + sumOfNumbers(N));;
        sc.close();
    }
}
