package StringInterviewQues;

public class removeVowels {
    public static void main(String[] args){
        String s = "hello sakshi kaurav";
        StringBuilder result = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            if("aeiouAEIOU".indexOf(c) == -1){
                result.append(c);

            }
        }
        System.out.println(result);
    }
    
}
