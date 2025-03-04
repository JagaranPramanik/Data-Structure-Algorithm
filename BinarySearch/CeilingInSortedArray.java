package BinarySearch;

import java.util.Scanner;

// Problem 7: Find the index of the ceiling value of a given element from a sorted array of elements.

public class CeilingInSortedArray {
    public static int findCeil(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low)/2;
            if(arr[mid] >= target) {
                result = mid;
                high = mid - 1;
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

        System.out.println("Enter target element: ");
        int k = sc.nextInt();

        System.out.println("Index of the Ceiling value of given element is: " + findCeil(arr, k));

        sc.close();
    }
    
}