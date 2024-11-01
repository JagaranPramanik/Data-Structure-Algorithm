package Basics;

// Problem 5: Print all divisors of a number.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PrintAllDivisors {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int N = sc.nextInt();
        List<Integer> allDivisors = getDivisors(N);
        System.out.println("All the divisors of the number are: ");
        for (int i = 0; i < allDivisors.size(); i++) {
            System.out.println(allDivisors.get(i));
        }
        sc.close();
    }

    static List<Integer> getDivisors(int num) {
        List<Integer> divisors = new ArrayList<Integer>();
        // iterating till sqrt(num)
        for (int i = 1; i*i <= num; i++) {
            if (num % i == 0) {
                divisors.add(i);
                if ((num/i) != i) {
                    divisors.add(num/i);
                }
            }
        }
        Collections.sort(divisors);
        return divisors;
    }

}
