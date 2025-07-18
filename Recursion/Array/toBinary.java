package Recursion.Array;

public class toBinary {
    public static void main(String[] args){
        convert(10);

    }

    static void convert(int n){
        if(n == 0) return;
        convert(n/2);
        System.out.print(n%2);

    }
    
}
