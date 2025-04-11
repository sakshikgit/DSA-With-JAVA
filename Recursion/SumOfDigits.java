package Recursion;

public class SumOfDigits {

   
    public static void main(String[] args) {
        int ans = Sum(1342);
        System.out.println(ans);
        
    }

    static int Sum(int number){
        if(number == 0){
            return 0;
        }
        return (number%10) + Sum(number/10);
    }
    
}
