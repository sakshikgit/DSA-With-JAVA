package StringInterviewQues;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PalindromeRearrange {
    public static void main(String[] args) {

//         A string can be rearranged into a palindrome if:

// For even length strings → all characters must occur even number of times.

// For odd length strings → all characters except one must occur even number of times (only one odd count is allowed → this will sit in the middle of palindrome).
        

            String s = "carrace";

            HashMap<Character, Integer> map = new HashMap<>();

            for(char c : s.toCharArray()){
                map.put(c, map.getOrDefault(c, 0)+1);

            }

            int oddCount = 0;

            for(int freq : map.values())
            {
                if(freq % 2 != 0)
                {
                    oddCount++;
                }
            }

            if (oddCount <= 1) {
            System.out.println("Can be rearranged to palindrome");
        } else {
            System.out.println("Cannot be rearranged to palindrome");
        }



    }

  public static void PalindromeRearrange3() {
    
        String s = "aabbccdde";

        Set<Character> set = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                set.remove(c);
            } else {
                set.add(c);
            }
        }

        if (set.size() <= 1) {
            System.out.println("Can be rearranged to palindrome");
        } else {
            System.out.println("Cannot be rearranged to palindrome");
        }
    }  



    public static void PalindromeRearrange2() {
  
        String s = "aab";

        int[] freq = new int[256];

        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        int oddCount = 0;

        for (int f : freq) {
            if (f % 2 != 0) {
                oddCount++;
            }
        }

        if (oddCount <= 1) {
            System.out.println("Can be rearranged to palindrome");
        } else {
            System.out.println("Cannot be rearranged to palindrome");
        }
    }
}

    

