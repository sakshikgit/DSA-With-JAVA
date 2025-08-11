package BinarySearch;

public class FloorCeil {
    public static void main(String[] args){
        int arr[] = {4, 4, 8, 8, 8, 15, 16, 23, 23, 42};
         int ans = binarySearchFloor(arr,16);
        System.out.println("floor is :"+ ans);
         int ans1 = binarySearchCeil(arr,16);
        System.out.println("ceil is :"+ ans1);


    }

    static int binarySearchFloor(int arr[], int target){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target)
            {
                ans = arr[mid];
                break;

            }
            else if(arr[mid]<target)
            {
                start = mid+1;
                ans = arr[mid];
            }
            else
            {
                end = mid -1;

            }
        }
        return ans;
    }

    static int binarySearchCeil(int arr[], int target){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;

            if(arr[mid] == target)
            {
                ans = arr[mid];
                break;
            }
            else if(arr[mid]<target)
            {
                start = mid+1;
            }
            else
            {
                end = mid - 1;
                ans = arr[mid];
            }

        }
        return ans;
    }
    
}
