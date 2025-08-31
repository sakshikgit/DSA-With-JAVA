import java.util.HashMap;
import java.util.Map;

public class hashMap {
    public static void main(String[] args){

        int[] arr = {2,3,4,5,6,7,8,2,3,4,5,6,7,8};

        //creation 
       HashMap<Integer, Integer> mp = new HashMap<>();

       for(int i=0; i<arr.length; i++){
        mp.put(arr[i], mp.getOrDefault(arr[i], 0)+1);
       }

       int min = Integer.MAX_VALUE;
       int digit = -1;

       for(Map.Entry<Integer, Integer> entry : mp.entrySet()){
        if(entry.getValue()<min){
            min = entry.getValue();
            digit = entry.getKey();
        }
       }

       System.out.println(digit);


    }
    
}
