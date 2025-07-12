package Recursion.Array;

public class palindrome {
    public static void main(String[] args){
        String s = "hananah";
        boolean result = check(s, 0, s.length()-1);
        System.out.println(result);

    }

     static boolean check(String s, int left, int right){
        if(left >= right){
            return true;
        }

        if(s.charAt(left) != s.charAt(right)){
            return false;
        }
        
        return check(s, left+1, right-1);
     }
    
}
