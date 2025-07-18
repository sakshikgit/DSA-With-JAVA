package Recursion.Array;

public class Sort {
    public static void main(String[] args){
        int[] nums = {1, 3, 6, 8, 9};
        boolean result = sort(nums, 0);
        System.out.println(result);

    }

    static boolean sort(int[] nums, int left){
        if(left == nums.length - 1 || nums.length <= 1){
            return true;

        }

        if(nums[left] > nums[left+1]){
            return false;
        }

        return sort(nums, left+1);
        
    }
    
}
