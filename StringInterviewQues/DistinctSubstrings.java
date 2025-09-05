package StringInterviewQues;

import java.util.HashSet;

//find the number of distinct substring of string
public class DistinctSubstrings {
    public static void main(String[] args) {
        String s = "ababa";
        int n = s.length();

        HashSet<String> set = new HashSet<>();

        for(int i=0; i<n; i++){
            StringBuilder sb = new StringBuilder();
            for(int j=1; j<n; j++){
                sb.append(s.charAt(j));
                set.add(sb.toString());
            }
        }

         System.out.println("Number of distinct substrings: " + set.size());
        
    }
    
}
