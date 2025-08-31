package StringInterviewQues;

public class VowelConsonant {
    public static void main(String[] args){
        String s = "Hello World";
        s = s.toLowerCase();

        int v  = 0;
        int c = 0;

        for(int i=0; i<s.length(); i++){
            char cr = s.charAt(i);

            if(cr >= 'a' && cr<= 'z') // consider only alphabets
            {
                if("aeiou".indexOf(cr) != -1)
                {
                    v++;
                }
                else
                {
                    c++;

                }

            }
        }
        System.out.println("Vowels: " + v);
        System.out.println("Consonants: " + c);
    }
    
}
