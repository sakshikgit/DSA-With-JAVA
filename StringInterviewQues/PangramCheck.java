package StringInterviewQues;
import java.util.HashSet;
import java.util.Set;

public class PangramCheck {
    public static void main(String[] args) {
        
        String s = "The quick brown fox jumps over the lazy dog";

        s = s.toLowerCase().replaceAll("[^a-z]", "");

        Set<Character> set = new HashSet<>();
        for(char c : s.toCharArray())
        {
            set.add(c);
        }

        if(set.size() == 26)
        {
            System.out.println("Pangram");
        }
        else{
            System.out.println("Not Pangram");
        }
    }

    public static void PangramCheck2() {
   
        String s = "The quick brown fox jumps over the lazy dog";
        s = s.toLowerCase();

        boolean[] seen = new boolean[26];

        for (char c : s.toCharArray()) 
        {
            if (c >= 'a' && c <= 'z') {
                seen[c - 'a'] = true;
            }
        }

        boolean isPangram = true;
        for (boolean b : seen) 
        {
            if (!b) {
                isPangram = false;
                break;
            }
        }

        if (isPangram) 
        {
            System.out.println("Pangram");
        } else 
        {
            System.out.println("Not Pangram");
        }
    }

    public static void PangramCheck3(){
   
        String s = "The quick brown fox jumps over the lazy dog".toLowerCase();

        boolean isPangram = true;

        for (char c = 'a'; c <= 'z'; c++) {
            if (s.indexOf(c) == -1) {
                isPangram = false;
                break;
            }
        }

        if (isPangram) {
            System.out.println("Pangram");
        } else {
            System.out.println("Not Pangram");
        }
    }
    
}
