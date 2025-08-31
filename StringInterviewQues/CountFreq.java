package StringInterviewQues;

import java.util.HashMap;
import java.util.Map;

public class CountFreq {
    public static void main(String[] args){
        String s = "asfkmdfknnjfngifg";

        char[] crr = s.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : crr){
            map.put(c, map.getOrDefault(c, 0)+1);

        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());

        }

    }
    
}
