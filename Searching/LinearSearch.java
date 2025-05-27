package Searching;

public class LinearSearch {
    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 7, 8, 5, 9};
        int ans = search(arr, 10);
        System.out.println(ans);
        
    }

    // searchnin the array: return the index if item found
    // if item not found return -1

    static int search(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
            
        }

        return -1;
    }
    
}
