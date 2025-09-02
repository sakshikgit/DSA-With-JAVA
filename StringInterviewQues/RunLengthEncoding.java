package StringInterviewQues;

public class RunLengthEncoding {
    public static void main(String[] args) {
        String s = "wwwwaaadexxxxxx";

        String encoded = encode(s);

          System.out.println("Original: " + s);
        System.out.println("Encoded : " + encoded);
    }

    public static String encode(String s){

        if(s == null || s.isEmpty()) return "";

        StringBuilder encoded = new StringBuilder();
        int count = 1;

        for(int i=0; i<s.length(); i++){
            if(i+1 < s.length() && s.charAt(i) == s.charAt(i+1))
            {
                count++;
            }
            else{
                encoded.append(s.charAt(i));
                encoded.append(count);
                count = 1;
            }
        }

        return encoded.toString();
    }
    
}
