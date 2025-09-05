package StringInterviewQues;
import java.util.*;

public class SmallestSubstringAllUnique {
    public static void main(String[] args) {
        String s = "aabcbcdbca";

        // Step 1: Find unique characters
        Set<Character> uniqueChars = new HashSet<>();
        for (char c : s.toCharArray()) {
            uniqueChars.add(c);
        }
        int required = uniqueChars.size();

        // Step 2: Sliding window
        Map<Character, Integer> freq = new HashMap<>();
        int left = 0, minLen = Integer.MAX_VALUE, startIndex = 0, count = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            freq.put(c, freq.getOrDefault(c, 0) + 1);

            if (freq.get(c) == 1) { // new unique char in window
                count++;
            }

            // When window has all unique chars, shrink it
            while (count == required) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    startIndex = left;
                }

                char leftChar = s.charAt(left);
                freq.put(leftChar, freq.get(leftChar) - 1);
                if (freq.get(leftChar) == 0) {
                    count--;
                }
                left++;
            }
        }

        String result = s.substring(startIndex, startIndex + minLen);
        System.out.println("Smallest substring containing all unique characters: " + result);
        System.out.println("Length = " + minLen);
    }
}

