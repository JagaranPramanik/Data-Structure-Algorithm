package BinarySearch;

import java.util.Scanner;

// Problem 3: Write a program to return the smallest index of an element greater than or equal to given target

public class LowerBound {
    public static int lowerBound(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int result = arr.length;
        while (low <= high) {
            int mid = low + (high - low)/2;
            if(arr[mid] >= target) {
                high = mid - 1; // to search if a smaller index may be present
                result = mid;
            }
            else {
                low = mid + 1;
            }
        }
        return result;
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

        System.out.println("Enter the lower bound element to be found: ");
        int k = sc.nextInt();

        System.out.println("The lower bound index is: " + lowerBound(arr, k));

        sc.close();
    }
    
}