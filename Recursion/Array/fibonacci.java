package Recursion.Array;

public class fibonacci {
    public static void main(String[] args){
        int n = 5;
        System.out.println(fib(5));
    }

    static int fib(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;

        return fib(n-1) + fib(n-2);
    }
    
}
