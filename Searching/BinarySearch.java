package Searching;

public class BinarySearch {
    public static void main(String[] args){

        int[] arr = {2, 4, 6, 8, 10, 12};
        int ans = binarySearch(arr, 10);
        System.out.println(ans);



    }


    //return the index
    // return -1 if does not exist
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        // int mid = (start - end) + start / 2;

        while(start <= end){
            // find middle element
            // int mid = start+end / 2 -> for large values of start and end the 
            // value of mid may exceed the range of integer 

             int mid = (end - start) + start / 2;

             if(target > arr[mid]){
                start = mid + 1;
             } else if(target < arr[mid]){
                end = mid - 1;
             } else{
                return mid;
             }
      }

      return -1;

    }
    
}
