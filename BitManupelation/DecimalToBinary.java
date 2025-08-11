package BitManupelation;

public class DecimalToBinary {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int n = 11;
        while(n >0){
            int rem = n%2;
            sb.append(rem);
            n = n/2;

        }
        sb = sb.reverse();
        // System.out.println(sb);
        int setBit = 0;
        for(int i=0; i<sb.length(); i++){
            if(sb.charAt(i) == '1'){
                setBit++;
            }
        }
        System.out.println(setBit);
    }
    
}
