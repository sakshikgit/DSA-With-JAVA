package StringInterviewQues;

public class StringCompression {
    public static void main(String[] args) {
        String s = "aaabbcddd";

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for(int i=0; i<s.length(); i++){
            if(i+1 < s.length() && s.charAt(i) == s.charAt(i+1)){
                count++;
            }
            else{
                compressed.append(s.charAt(i));
                compressed.append(count);
                count = 1;
            }
        }

        System.out.println("Original: " + s);
        System.out.println("Compressed: " + compressed.toString());
    }
    
    
}
