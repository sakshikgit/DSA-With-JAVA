package StringInterviewQues;

public class CountCharacters {
    public static void main(String[] args) {
        
        String s = "Hello123@world!";

        int upper = 0, lower = 0, digit = 0, special = 0;

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            if(c >= 'A' && c <= 'Z'){
                upper++;
            }
            else if(c >= 'a' && c<= 'z'){
                lower++;
            }
            else if(c >= '0' && c <= '9'){
                digit++;
            }
            else{
                special++;
            }
        }

        System.out.println("Uppercase letters: " + upper);
        System.out.println("Lowercase letters: " + lower);
        System.out.println("Digits: " + digit);
        System.out.println("Special characters: " + special);


    }
    
}
