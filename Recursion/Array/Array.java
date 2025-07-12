package Recursion.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class Array {
    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4};
        int result = arraySum(nums, 0);
        System.out.println(result);

        ArrayList<Character> s = new ArrayList<>(Arrays.asList('a', 'b', 'c', 'd'));
         reverse(s, 0, s.size() - 1);
         System.out.println(s);  // Output: [d, c, b, a]
       
    }

    public static int arraySum(int[] nums, int left){
        if(left >= nums.length){
            return 0;
        }
        return nums[left] + arraySum(nums, left+1);
    }

    public static void reverse(ArrayList<Character> s, int left, int right){
        // base condition
        if(left > right){
            return;
        }

        //swap 
        char temp = s.get(left);
        s.set(left, s.get(right));
        s.set(right, temp);

        //recursive call
        reverse(s, left+1, right-1);



    }
    
}
