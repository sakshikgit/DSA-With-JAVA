package InterviewQues;

import java.util.HashMap;
import java.util.Map;

public class Occurance {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7, 2, 2, 5};
        int target = 2;

        int count = 0;
        for(int num : arr){
            if(num == target){
                count++;
            }
        }
        System.out.println(target +  " has occurs for " + count + " times");

        OccuranceUsingMap(arr);
    }

    public static void OccuranceUsingMap(int[] arr){

        Map<Integer, Integer> freqMap = new HashMap<>();

        for(int num : arr){
            freqMap.put(num, freqMap.getOrDefault(num, 0) +1);
        }

        int maxFreq = 0;
        int element = -1;

        for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()){
            if(entry.getValue() > maxFreq){
                maxFreq = entry.getKey();
                element = entry.getKey();
            }
        }

        System.out.println("Element with highest occurrence: " + element);
        System.out.println("It occurs " + maxFreq + " times.");
    }
    
}
