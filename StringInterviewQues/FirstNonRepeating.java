package StringInterviewQues;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeating {
    public static void main(String[] args){
        String s = "hdgdfdfbdfbfvdfdf";

        Map<Character, Integer> mp = new LinkedHashMap<>();

        for(char c : s.toCharArray()){
            mp.put(c, mp.getOrDefault(c, 0)+1);
        }

        for(Map.Entry<Character, Integer> entry : mp.entrySet()){
            if(entry.getValue() == 1){
                System.out.println("first non repeating -> " + entry.getKey());
                return;

            }
        }

        System.out.println("not found");


    } 
    
}
