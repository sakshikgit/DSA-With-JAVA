package StringInterviewQues;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstring {
    public static void main(String[] args) {
        
        String s = "abcabcbb";
        LongestSubstringBruteForce(s);

    }

    public static void LongestSubstringBruteForce(String s){

        int maxLen = 0;
        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<=s.length(); j++){
                String sub = s.substring(i, j);
                if(allUnique(sub)){
                    maxLen = Math.max(maxLen, sub.length());
                }
            }
        }
        System.out.println("Brute Force Result: " + maxLen);

    }

    static boolean allUnique(String str){
        boolean[] seen = new boolean[256];
        for(char c : str.toCharArray()){
            if(seen[c]) return false;
            seen[c] = true;
        }
        return true;
    }


    public static void LongestSubstringHashSet(String s) {

           int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            HashSet<Character> set = new HashSet<>();
            for (int j = i; j < s.length(); j++) {
                if (set.contains(s.charAt(j))) break;
                set.add(s.charAt(j));
                maxLen = Math.max(maxLen, j - i + 1);
            }
        }

        System.out.println("HashSet Method Result: " + maxLen);
    }

     public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            if (map.containsKey(c) && map.get(c) >= left) {
                left = map.get(c) + 1;  // shrink window
            }

            map.put(c, right);
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
    
}
