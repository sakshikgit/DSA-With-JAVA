package Recursion.Array;
import java.util.Scanner;

public class primeOrNot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean result = prime(n, 2);
        System.out.println(result);


    }

    static boolean prime(int n, int x){
        if(n <= 1){
            return false;
        }
        if(x > Math.sqrt(n)){
            return true;
        }

        if(n % x == 0){
            return false;
        }

        return prime(n, x+1);

    }
    
}
