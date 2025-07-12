package Recursion.Array;

public class basic {
    public static void main(String[] args){
        // fun(10);
        // System.out.println(sum(5));
        sum(5);
        System.out.println(fact(5));

    }


    // static void fun(int n){
    //     if(n == 0){
    //         return;
    //     }
    //     fun(n-1);
    //     System.out.println(n);
    //     // fun(n-1);
    // }

    static int sum(int n){
        if(n == 0){
            return 0;
        }
        return n + sum(n-1);
    }

    static int fact(int n){
        if(n == 0 || n == 1){
            return 1;
        }

        return n * fact(n-1);
    }

    
    
}
