package Sorting;

// Problem 5: Sort the elements of an array using Merge sort

import java.util.ArrayList;

import java.util.Scanner;

public class MergeSort {

    static void merge(int[] arr, int start, int mid, int end) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = start; // starting index of left array
        int right = mid + 1; // starting index of right array

        while (left <= mid && right <= end) {
            if(arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            }
            else {
                temp.add(arr[right]);
                right++;
            }
        }

        // if elements on the left half are still left
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        // if elements on the right half are still left
        while (right <= end) {
            temp.add(arr[right]);
            right++;
        }

        // transfering all elements from temp[] to arr[]
        for (int i = start; i <= end; i++) {
            arr[i] = temp.get(i - start);
        }
    }

    static void mergeSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = (start + end)/2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);
        merge(arr, start, mid, end);
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

        mergeSort(arr, 0, arr_size - 1);

        System.out.println("The sorted array is: ");
        for (int i = 0; i < arr_size; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
