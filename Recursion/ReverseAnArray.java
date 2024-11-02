package Recursion;

// Problem 5: Reverse a given array using recursion

import java.util.Scanner;

public class ReverseAnArray {

    static void reverseArray(int[] arr, int start) {
        if (start >= arr.length / 2) {
            return;
        }
        int last = arr.length - 1;
        int temp = arr[last - start];
        arr[last - start] = arr[start];
        arr[start] = temp;
        reverseArray(arr, start + 1);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int arr_size = 0;
        if (sc.hasNextInt()) {
            arr_size = sc.nextInt();
        }
 
        int[] arr = new int[arr_size];
 
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr_size; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }
        }

        reverseArray(arr, 0);

        System.out.println("The elements of the array are: ");
        for (int i = 0; i < arr_size; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }

}
