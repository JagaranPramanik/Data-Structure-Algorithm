package Recursion;

// Problem 6: Check whether a string is Palindrome

import java.util.Scanner;

public class PalindromeString {

    static boolean isPalindromeString(String str, int start) {
        if (start >= str.length() / 2) {
            return true;
        }
        int last = str.length() - 1;
        if (str.charAt(last - start) != str.charAt(start)) {
            return false;
        }
        return isPalindromeString(str, start + 1);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println(isPalindromeString(str, 0) == true ? "Palindrome String" : "Not Palindrome String");
        sc.close();
    }

}
