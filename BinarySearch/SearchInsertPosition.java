package BinarySearch;

import java.util.Scanner;

// Problem 5: Given a sorted array of distinct integers and a target value, return the index if the target is found. 
// If not, return the index where it would be if it were inserted in order.

public class SearchInsertPosition {
    public static int lowerBound(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int result = arr.length;
        while (low <= high) {
            int mid = low + (high - low)/2;
            if(arr[mid] >= target) {
                high = mid - 1;
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

        System.out.println("Enter target element: ");
        int k = sc.nextInt();

        System.out.println("The index is: " + lowerBound(arr, k));

        sc.close();
    }
    
}