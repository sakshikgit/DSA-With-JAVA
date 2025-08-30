package InterviewQues;

import java.util.HashSet;

public class PairSum {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        int target = 6;

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println(arr[i] + " , " + arr[j]);
                }
            }
        }


    }

    public static void pairsum(int[] arr, int target){
        HashSet<Integer> set = new HashSet<>();

        for(int num : arr){
            int comp = target - num;
            if(set.contains(comp)){
                System.out.println(comp + " , " + num);
            }
            set.add(num);
        }
    }
    
}
