package BinarySearch;

import java.util.Scanner;

// Problem 8: Find the first and last occurence of a given element from a sorted array of elements. If element is not found, then return -1

public class FirstAndLastOccurence {
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

    public static int[] findOccurence(int[] nums, int target) {
        int[] ans = {-1, -1};
        int first = findFirstOccurence(nums, target);
        if(first == -1) {
            return ans;
        }
        ans[0] = first;
        ans[1] = findLastOccurence(nums, target);
        return ans;
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

        System.out.println("Index of the first occurence of given element is: " + findOccurence(arr, k)[0]);
        System.out.println("Index of the last occurence of given element is: " + findOccurence(arr, k)[1]);

        sc.close();
    }
    
}