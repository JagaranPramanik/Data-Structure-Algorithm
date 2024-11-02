package Recursion;

// Problem 4: Print factorial of a given number

import java.util.Scanner;

public class FactorialOfN {
    
    static int fact(int num) {
        if (num == 0) {
            return 1;
        }
        return num * fact(num - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: \n");
        int N = sc.nextInt();
        System.out.println("Factorial of the number is " + fact(N));;
        sc.close();
    }
}
