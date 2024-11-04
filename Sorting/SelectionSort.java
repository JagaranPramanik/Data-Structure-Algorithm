package Sorting;

// Problem 1: Sort the elements of an array using Selection sort

import java.util.Scanner;

public class SelectionSort {

    static void selectionSort(int[] arr) {
        for (int i = 0; i <= arr.length - 2; i++) {
            int min_index = i;
            for (int j = i; j <= arr.length - 1; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            // swapping
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
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

        selectionSort(arr);

        System.out.println("The sorted array is: ");
        for (int i = 0; i < arr_size; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
