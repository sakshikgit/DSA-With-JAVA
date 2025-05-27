package Searching;

public class OrderAgnosticBS {
    public static void main(String[] args){

        int[] arr = {-18, -12, -4, 0, 2, 4, 6, 8, 22, 45, 89};
        int target = 22;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);

    }

    static int orderAgnosticBS(int[] arr, int target){
        int s = 0;
        int e = arr.length - 1;

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[s] < arr[e];

        while(s <= e){
            int m = (e-s) + s / 2;

            if(arr[m] == target){
                return m;
            }

            if(isAsc){
                if(target < arr[m]){
                    e = m - 1;
                } else {
                    s = m + 1;
                }
            }else{
                    if(target > arr[m]){
                        e = m -1;
                    } else{
                        s = m + 1;
                    }
                }
            

             

        }
          return -1;
    }
    
}
