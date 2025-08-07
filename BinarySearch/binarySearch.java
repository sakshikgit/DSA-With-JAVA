package BinarySearch;

import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // System.out.println("give size");
        // int n = sc.nextInt();

        // int[] arr = new int[n];
        // System.out.println("give elements of array");

        // for(int i=0; i<n; i++){
        // arr[i] = sc.nextInt();

        // }
        // System.out.println("give target");
        // int target = sc.nextInt();

        int arr[] = { 2, 5, 7, 11, 45, 87, 90 };
        int ans = BS(arr, 87);
        if (ans == -1) {
            System.out.println("element not found");
        } else {
            System.out.println("found element" + "at index :" + ans);
        }

        int arr2[] = { 90, 87, 54, 36, 22, 1 };
        binarySearchDesc(arr2, 54);
        binarySearchOrderAgnostic(arr2, 510);
        binarySearchOrderAgnostic(arr, 871);

    }

    // this method for simple binary search, means when array is sorted in
    // increasing order
    static int BS(int arr[], int target) {
        int n = arr.length;
        int s = 0;
        int e = n - 1;
        int ans = -1;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (arr[m] == target) {
                ans = m;
            } else if (arr[m] > target) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
        return -1;
    }

    static void binarySearchDesc(int arr[], int target) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = mid;
                break;
            } else if (arr[mid] < target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        if (ans == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Found element " + target + " at index : " + ans);
        }
    }

    static void binarySearchOrderAgnostic(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        if (arr[start] <= arr[end]) {
            BS(arr, target);
        } else {
            binarySearchDesc(arr, target);
        }
    }
}
