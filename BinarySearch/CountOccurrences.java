package BinarySearch;

import java.util.Scanner;

// Problem 9: Count occurrences of a number in a sorted array with duplicates

public class CountOccurrences {
    public static int findFirstOccurence(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int first = -1;
        while (low <= high) {
            int mid = low + (high - low)/2;
            if(arr[mid] == target) {
                first = mid;
                high = mid - 1;
            }
            else if(arr[mid] > target) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return first;
    }

    public static int findLastOccurence(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int last = -1;
        while (low <= high) {
            int mid = low + (high - low)/2;
            if(arr[mid] == target) {
                last = mid;
                low = mid + 1;
            }
            else if(arr[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return last;
    }

    public static int countOccurence(int[] nums, int target) {
        int first = findFirstOccurence(nums, target);
        if(first == -1) {
            return 0;
        }
        int last = findLastOccurence(nums, target);
        // Total number of occurrences = last occurrence - first occurrence + 1
        int count = last - first + 1;
        return count;
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

        System.out.println("Total number of occurrences: " + countOccurence(arr, k));

        sc.close();
    }
    
}