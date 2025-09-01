package StringInterviewQues;

public class SwapCase {
    public static void main(String[] args) {
        String s = "HeLLo Sakshi 123";
        StringBuilder res = new StringBuilder();

        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);

            if(c >= 'A' && c <= 'Z'){
                res.append((char)(c+32));
            }
            else if(c >= 'a' && c <= 'z')
            {
                res.append((char)(c-32));
            }
            else
            {
                res.append(c);
            }
        }

        System.out.println("Original: " + s);
        System.out.println("Swapped : " + res.toString());
    }
    
}
