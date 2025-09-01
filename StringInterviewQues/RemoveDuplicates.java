package StringInterviewQues;

import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String s = "programmming";

        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<>();

        for(char c : s.toCharArray())
        {
            if(!set.contains(c))
            {
                sb.append(c);
                set.add(c);
            }
        }

        System.out.println("Original: " + s);
        System.out.println("Without duplicates: " + sb.toString());
    }

    static void RemoveDuplicates2(String s){
         s = "programming";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (s.indexOf(c) == i) {   // keep only first occurrence
                sb.append(c);
            }
        }

        System.out.println("Without duplicates: " + sb.toString());

    }
    
}
