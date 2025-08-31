package StringInterviewQues;

public class ConvertToUpperLowerCase {
    public static void main(String[] args) {

       String s = " Hello  WoRLd ";
       ToLower(s);
       ToUpper(s);


    }

    public static void ToLower(String s){
        String result = "";

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            if(c >= 'A' && c <='Z')
            {
                result += (char)(c+32);
            }
            else{
                result += c;
            }
        }

        System.out.println(result);





    }

    public static void ToUpper(String s){

        String result = "";

        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);

            if(c >= 'a' && c<= 'z')
            {
                result += (char)(c-32);
            }
            else{
                result += c;
            }
        }

        System.out.println(result);

    }

}
