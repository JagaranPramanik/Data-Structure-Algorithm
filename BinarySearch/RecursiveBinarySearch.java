package BinarySearch;

import java.util.Scanner;

// Problem 2: Write a program to return the index of an element from a given array

public class RecursiveBinarySearch {
    public static int binarySearch(int[] arr, int target, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = low + (high - low)/2;
        if (arr[mid] == target) {
            return mid;
        }
        else if (arr[mid] < target) {
            return binarySearch(arr, target, mid + 1, high);
        }
        return binarySearch(arr, target, low, mid - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int arr_size = 0;
        if (sc.hasNextInt()) {
            arr_size = sc.nextInt();
        }
 
        int[] arr = new int[arr_size];
 
        System.out.println("Enter the elements of the sorted array: ");
        for (int i = 0; i < arr_size; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }
        }

        System.out.println("Enter the element to be found: ");
        int k = sc.nextInt();

        System.out.println("The index of the element is: " + binarySearch(arr, k, 0, arr_size));

        sc.close();
    }
    
}