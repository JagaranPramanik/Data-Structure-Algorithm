package Array;

// Problem 8: Move all the zeros to the end of the array

import java.util.Scanner;

public class MoveZerosToEnd {

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void moveZeros(int[] nums) {
        int i = -1;
        // finding the index of first zero element
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] == 0) {
                i = j;
                break;
            }
        }

        // if there is no non-zero element
        if(i == -1) {
            return;
        }
        
        for (int k = i+1; k < nums.length; k++) {
            if(nums[k] != 0) {
                swap(nums, i, k);
                i++;
            }
        }
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

        moveZeros(arr);

        System.out.println("The resultant array is: ");
        for (int i = 0; i < arr_size; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }

}
