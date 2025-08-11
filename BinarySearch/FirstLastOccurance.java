package BinarySearch;

public class FirstLastOccurance {
    public static void main(String[] args){
        int arr[] = {2,2,3,4,4,4,4,4,6,8,9};
        int first = binarySearch(arr, 4, true);
        // System.out.println(first);
        int last = binarySearch(arr, 4, false); 
        System.out.println("total number of Occurrence of target is :"+ (last - first + 1));

        //if isFirst is true it will give first occ
        //if isFirst is false it will give last occ
        //last-first+1 gives total number of occurance
        
    }

    static int binarySearch(int arr[], int target, boolean isFirst){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid] == target)
            {
                ans = mid;
                if(isFirst){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else if(arr[mid]<target)
            {
                start = mid+1;
            }
            else
            {
                end = mid - 1;
            }
        }

        return ans;

    }
    
}
