package BinarySearch;

import java.util.List;

public class BSProblems {
    public static void main(String[] args) {
        
    }

    //leetcode 941. Valid Mountain Array
    public static boolean validMountainArray(int[] arr){
        int index = 0;
        int n = arr.length;

        //find all increasing seq
        while(index < n-1){
            if(arr[index] < arr[index+1])
            {
                index++;
            }
            else{
                break;
            }
        }

        if(index == 0 || index == n-1)
        {
            return false;
        }

        //find all decreasing seq
        while(index<n-1)
        {
            if(arr[index]>arr[index+1])
            {
                index++;
            }
            else{
                break;
            }

        }

        return (index == n-1);

    }

    // leetcode 852. Peak Index in a Mountain Array
    // public int peakIndexInMountainArray(int[] arr) {
    //     int n = arr.length;
    //     int start = 0;
    //     int end = n-1;
    //     while(start<=end){
    //         int mid = start + (end-start)/2;
    //         if(mid != 0 && mid != n-1 && arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1] ){
    //             return mid;
    //         }
    //         else if(mid!=n-1 && arr[mid] < arr[mid+1]){
    //             start = mid+1;
    //         }
    //         else{
    //             end = mid - 1;
    //         }
    //     }
    //     return -1;
        
    // }

    //  public int peakIndexInMountainArray(int[] arr) {
    //     int n = arr.length;
    //     int start = 0;
    //     int end = n-1;
    //     while(start < end){
    //         int mid = start + (end - start)/2;
    //         if(arr[mid] < arr[mid+1]){
    //             start = mid + 1;
    //         }
    //         else{
    //             end = mid ;
    //         }
    //     }
    //     return start;
        
    // }



  // leetcode 1095: find in mountain array
  
//    public int findInMountainArray(int target, MountainArray mountainArr) {
//         // find peak index
//         int n = mountainArr.length();
//         int start=0;
//         int end=n-1;
//         int mid=-1;
//         while(start<=end){
//             mid = start + (end-start)/2;
//             int cur = mountainArr.get(mid);
//             if(mid!=0 && mid!=n-1 && cur>mountainArr.get(mid-1) 
//             && cur >mountainArr.get(mid+1)){
//                 if(cur==target){
//                     return mid;
//                 }
//                 break;
//             }else if(mid!=n-1 && cur<mountainArr.get(mid+1)){ //inc
//                 start = mid+1;
//             }else{ //dec
//                 end = mid-1;
//             }
//         }
//         // find in first half (increasing)
//         start = 0;
//         end = mid-1;
//         while(start<=end){
//             int m = start + (end-start)/2;
//             int cur = mountainArr.get(m);
//             if(cur==target){
//                 return m;
//             }else if(target<cur){
//                 end=m-1;
//             }else{
//                 start=m+1;
//             }
//         }

//         // find in second half (decreasing array)
//         start = mid+1;
//         end = n-1;
//         while(start<=end){
//             int m = start + (end-start)/2;
//             int cur = mountainArr.get(m);
//             if(cur==target){
//                 return m;
//             }else if(target<cur){
//                 start=m+1;
//             }else{
//                 end=m-1;
//             }
//         }
//         return -1;
//     }


//leetcode 33. Search in Rotated Sorted Array
// class Solution {
//     public int search(int[] arr, int target) {
//         int start = 0;
//         int end = arr.length-1;
//         int ans=-1;
//         while (start <= end) {
//             int mid = start + (end - start) / 2;
//             if (target == arr[mid]) {
//                 return mid;
//             }
//             // left side is sorted
//             if (arr[start] <= arr[mid]) {
//                 // can ans be found in left side?
//                 if (target >= arr[start] && target < arr[mid]) {
//                     end = mid - 1;
//                 } else {
//                     start = mid + 1;
//                 }
//             } // right side is sorted 
//             else {
//                 // can ans be found in right side?
//                 if (target > arr[mid] && target <= arr[end]) {
//                     start = mid + 1;
//                 } else {
//                     end = mid - 1;
//                 }
//             }
//         }
//         return ans;

    
// }


// leetcode 81. Search in rotated sorted array 2
// class Solution {
//     public boolean search(int[] arr, int target) {
//         int start = 0;
//         int end = arr.length-1;
//         boolean ans=false;
//         // tc: logN + O(N/2)
//         while (start <= end) {
//             int mid = start + (end - start) / 2;
//             if (target == arr[mid]) {
//                 return true;
//             }
//             // if start,mid and end all are same then we can't guarentee which
//             // part is sorted so we will trim down the space
//             if(arr[start] == arr[mid] && arr[mid] == arr[end]){
//                 start++;
//                 end--;
//             }
//             // left side is sorted
//             else if (arr[start] <= arr[mid]) {
//                 // can ans be found in left side?
//                 if (target >= arr[start] && target < arr[mid]) {
//                     end = mid - 1;
//                 } else {
//                     start = mid + 1;
//                 }
//             } // right side is sorted 
//             else {
//                 // can ans be found in right side?
//                 if (target > arr[mid] && target <= arr[end]) {
//                     start = mid + 1;
//                 } else {
//                     end = mid - 1;
//                 }
//             }
//         }
//         return ans;
//     }
// }

// leetcode 153. Find Minimum in Rotated Sorted Array
// class Solution {
//     public int findMin(int[] nums) {
//         int n = nums.length;
//         int start = 0;
//         int end = n-1;
//         int minElement = Integer.MAX_VALUE;
//         while(start<=end){
//             int mid = start + (end-start)/2;
//             if(nums[start]<=nums[mid]){
//                 minElement = Math.min(minElement,nums[start]);
//                 start = mid+1;
//             }else{
//                 minElement = Math.min(minElement,nums[mid]);
//                 end = mid-1;
//             }
//         }
//         return minElement;
//     }


// leetcode 153. Find Minimum in Rotated Sorted Array
// class Solution {
//     public int findMin(int[] nums) {
//         int n = nums.length;
//         int start = 0;
//         int end = n-1;
//         int minElement = Integer.MAX_VALUE;
//         while(start<=end){
//             int mid = start + (end-start)/2;
//             if(nums[start]<=nums[mid]){
//                 minElement = Math.min(minElement,nums[start]);
//                 start = mid+1;
//             }else{
//                 minElement = Math.min(minElement,nums[mid]);
//                 end = mid-1;
//             }
//         }
//         return minElement;
//     }
// }



// gfg find Kth Rotation

// class Solution {
//     public int findKRotation(List<Integer> arr) {
//         // Code here
//         int n = arr.size();
//         int start = 0;
//         int end = n-1;
//         int minElement = Integer.MAX_VALUE;
//         int minIndex = Integer.MAX_VALUE;
//         while(start<=end){
//             int mid = start + (end-start)/2;
//             if(arr.get(start)<=arr.get(mid)){
//                 // minElement = Math.min(minElement,nums[start]);
//                 if(arr.get(start) < minElement){
//                     minElement = arr.get(start);
//                     minIndex = start;
//                 }
//                 start = mid+1;
//             }else{
//                 // minElement = Math.min(minElement,nums[mid]);
//                 if(arr.get(mid) < minElement){
//                     minElement = arr.get(mid);
//                     minIndex = mid;
//                 }
//                 end = mid-1;
//             }
//         }
//         return minIndex;
//     }
// }


}
