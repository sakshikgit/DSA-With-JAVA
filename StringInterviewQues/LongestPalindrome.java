package StringInterviewQues;
import java.util.Scanner;

public class LongestPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("give the string : ");

        String s = sc.next();
        LongestPalindromeBrute(s);
    }

    static void LongestPalindromeBrute(String s){
        String longest = "";

        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<=s.length(); j++){
                String sub = s.substring(i, j);
                if(isPalindrome(sub) && sub.length()>longest.length()){
                    longest = sub;
                }
            }
        }
        System.out.println("longest palindrome: "+ longest);
    }

    static boolean isPalindrome(String str) {
        int l = 0, r = str.length() - 1;
        while (l < r) {
            if (str.charAt(l) != str.charAt(r)) return false;
            l++; r--;
        }
        return true;
    }


    public static void LongestPalindromeCenter() {
    
        String s = "babad";
        String longest = "";

        for (int i = 0; i < s.length(); i++) {
            // Odd length palindrome
            String odd = expandFromCenter(s, i, i);

            // Even length palindrome
            String even = expandFromCenter(s, i, i + 1);

            // Take the longer one
            String curr = odd.length() > even.length() ? odd : even;

            if (curr.length() > longest.length()) {
                longest = curr;
            }
        }

        System.out.println("Longest Palindrome: " + longest);
    }

    static String expandFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // when while breaks → left & right are one step beyond valid palindrome
        return s.substring(left + 1, right);
    }
}

    

