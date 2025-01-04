package Array;

import java.util.ArrayList;

// Problem 10: Find the Union of two sorted arrays

import java.util.Scanner;

public class UnionOfTwoArrays {

    public static ArrayList<Integer> findUnion(int[] arr1, int[] arr2) {
        ArrayList<Integer> union = new ArrayList<Integer>();
        int i = 0, j = 0;

        while(i < arr1.length && j < arr2.length) {
            if(arr1[i] <= arr2[j]) {
                if(union.size() == 0 || union.get(union.size()-1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
            }
            else {
                if(union.size() == 0 || union.get(union.size()-1) != arr2[j]) {
                    union.add(arr2[j]);
                }
                j++;
            }
        }

        // if any elements left in array arr1
        while(i <arr1.length) {
            if(union.size() == 0 || union.get(union.size()-1) != arr1[i]) {
                union.add(arr1[i]);
            }
            i++;
        }

        // if any elements left in array arr2
        while(j < arr2.length) {
            if(union.size() == 0 || union.get(union.size()-1) != arr2[j]) {
                union.add(arr2[j]);
            }
            j++;
        }
        return union;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the first array: ");
        int arr1_size = 0;
        if (sc.hasNextInt()) {
            arr1_size = sc.nextInt();
        }
 
        int[] arr1 = new int[arr1_size];
 
        System.out.println("Enter the elements of the first array: ");
        for (int i = 0; i < arr1_size; i++) {
            if (sc.hasNextInt()) {
                arr1[i] = sc.nextInt();
            }
        }

        System.out.println("Enter the size of the second array: ");
        int arr2_size = 0;
        if (sc.hasNextInt()) {
            arr2_size = sc.nextInt();
        }
 
        int[] arr2 = new int[arr2_size];
 
        System.out.println("Enter the elements of the second array: ");
        for (int i = 0; i < arr2_size; i++) {
            if (sc.hasNextInt()) {
                arr2[i] = sc.nextInt();
            }
        }

        ArrayList<Integer> result = new ArrayList<Integer>();
        result = findUnion(arr1, arr2);

        System.out.println("The union array is: ");
        for(int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }

        sc.close();
    }

}
