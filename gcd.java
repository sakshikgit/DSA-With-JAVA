public class gcd {
    public static void main(String[] args) {
        int n = 4;

          int ans = gcdOfOddEvenSums(n);
          System.out.println(ans);
        
    }


    
    static int gcdOfOddEvenSums(int n) {
        int sumodd = 0;
        int sumeven = 0;

        for(int i=1; i<=n; i++){
            sumodd = sumodd+(2*i - 1);
            sumeven = sumeven+(2*i);
        }

        while(sumodd!=0){
            int t = sumodd;
            sumodd = sumeven%sumodd;
            sumeven = t;
        }

        return sumeven;
        
    }
}


    

