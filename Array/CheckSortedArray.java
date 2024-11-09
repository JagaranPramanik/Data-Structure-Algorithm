package Array;

import java.util.Scanner;

// Problem 3: Check if the given array is sorted in non-decreasing order

public class CheckSortedArray {

    public static boolean isSorted(int[] arr) {
        for (int i = 1; i <= arr.length - 1; i++) {
            if (arr[i] >= arr[i - 1]) {
                continue;
            }
            else {
                return false;
            }
        }
        return true;
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

        System.out.println(isSorted(arr));
        sc.close();
    }

}
