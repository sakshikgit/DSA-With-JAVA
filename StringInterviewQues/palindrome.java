package StringInterviewQues;

import java.util.Stack;

public class palindrome {
    public static void main(String[] args){
        String s = "abccba";

        char[] arr = s.toCharArray();
        int n = arr.length;
        int start = 0;
        int end = n-1;

        boolean isPalindrome = true;

        while(start<=end){
            if(arr[start] != arr[end]){
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }


        System.out.println(isPalindrome);
    }

    public static boolean isPalindrome1(String s) {
    int start = 0;
    int end = s.length() - 1;

    while (start < end) {
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }
        start++;
        end--;
    }
    return true;
}

public static boolean isPalindrome2(String s) {
    return s.equals(new StringBuilder(s).reverse().toString());
}


public static boolean isPalindrome3(String s) {
    return check(s, 0, s.length() - 1);
}

private static boolean check(String s, int start, int end) {
    if (start >= end) return true;
    if (s.charAt(start) != s.charAt(end)) return false;
    return check(s, start + 1, end - 1);
}

public static boolean isPalindrome6(String s) {
    s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    int start = 0, end = s.length() - 1;
    while (start < end) {
        if (s.charAt(start) != s.charAt(end)) return false;
        start++;
        end--;
    }
    return true;
}

public static boolean isPalindrome7(String s) {
    Stack<Character> stack = new Stack<>();
    for (char c : s.toCharArray()) {
        stack.push(c);
    }
    for (char c : s.toCharArray()) {
        if (c != stack.pop()) return false;
    }
    return true;
}


    
}
