package Array;

// Problem 9: Find the first occurence of an element in the given array

import java.util.Scanner;

public class LinearSearch {

    public static int linearSearch(int[] nums, int k) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == k) {
                return i;
            }
        }
        return -1;
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

        System.out.println("Enter the element to be found: ");
        int k = sc.nextInt();

        System.out.println("The index of the element is: " + linearSearch(arr, k));

        sc.close();
    }

}
