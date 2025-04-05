package Recursion;

public class factorial {
    public static void main(String[] args) {
        int ans = findFactorial(5);
        System.out.println(ans);
        
    }

    static int findFactorial(int n){
        if(n <= 1){
            return 1;
        }

       return n * findFactorial(n-1);

    }
    
}
