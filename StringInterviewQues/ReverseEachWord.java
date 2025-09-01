package StringInterviewQues;

public class ReverseEachWord {
    public static void main(String[] args) {
        String s = "I Love Java";

        String[] words = s.split(" ");

        StringBuilder result = new StringBuilder();

        for(String word : words){
            StringBuilder rev = new StringBuilder(word);
            result.append(rev.reverse()).append(" ");
        }

         System.out.println("Original: " + s);
        System.out.println("Reversed words: " + result.toString().trim());
    }
    
}
