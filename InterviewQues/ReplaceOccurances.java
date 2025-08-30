package InterviewQues;

import java.util.Arrays;

public class ReplaceOccurances {
    public static void main(String[] args){

        int[] arr = {5, 4, 9, 2, 8, 2, 5, 2};
        int target = 2;
        int newValue = 99;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                arr[i] = newValue;
            }
        }
        

        System.out.println("updated array: " + Arrays.toString(arr));
    }
    
}
