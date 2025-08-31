package StringInterviewQues;

public class ascii {
    public static void main(String[] args){
        String s = "Hello";

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            int ascii = (int) c;
            System.out.println(c + " -> " + ascii);
        }
    }
    
}
