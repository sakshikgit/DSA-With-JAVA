package InterviewQues;

import java.util.Scanner;

public class MaxMin {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("give the size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();

        }

        // for(int i=0; i<n; i++){
        //     System.out.println(arr[i]);
        // }

        LinearSearch(arr);

    }

    public static void LinearSearch(int[] nums){

        int max = nums[0];
        int min = nums[0];

        for(int i=0; i<nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }

            if(nums[i]<min){
                min = nums[i];
            }

        }

         System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);

    }
    
}
