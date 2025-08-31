package StringInterviewQues;

public class CountWords {

    public static void main(String[] args){

        String s = " Hello, world! this is java ";
    String trimmed = s.trim(); // removes leading/trailig spaces
    String[] parts = trimmed.split("\\s+"); //split on 1+ whitespaces

    int count = 0;

    for(String p : parts){
        String core = p.replaceAll("^[^A-Za-z0-9]+|[^A-Za-z0-9]+$", "");
        if(!core.isEmpty()) count++;
    }

    System.out.println("Word count: " + count);


    }

    public static void countwords1(String s){
        int count = 0;

        boolean inWord = false;

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            boolean isWordChar = Character.isLetterOrDigit(c);

            if(isWordChar && !inWord)
            {
                count++;
                inWord = true;
            }
            else if(!isWordChar)
            {
                inWord = false;
            }
        }
        System.out.println("word count: " + count);
    }

    
    
}
