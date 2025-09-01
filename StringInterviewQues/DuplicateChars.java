package StringInterviewQues;
import java.util.HashMap;
import java.util.Map;

public class DuplicateChars {
    public static void main(String[] args) {
        String s = "programming";

        char[] arr = s.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : arr){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        System.out.println("duplicate characters:");
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                System.out.println(entry.getKey() + " -> "+entry.getValue());
            }
        }
    }

    public static void DuplicateCharsArray(String s) {
    
         s = "programming";
        int[] freq = new int[256]; // for all ASCII chars

        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        System.out.println("Duplicate characters:");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 1) {
                System.out.println((char) i + " -> " + freq[i]);
            }
        
    }
    
}

}
