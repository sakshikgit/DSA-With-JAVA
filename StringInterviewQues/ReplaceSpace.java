package StringInterviewQues;

public class ReplaceSpace {
    public static void main(String[] args) {
        
        String s = "Hello World Java Programming";

        String result = s.replace(" ", "-");

          // \s = any whitespace (space, tab, newline)
        // String result = s.replaceAll("\\s+", "-");

        // for (char c : s.toCharArray()) {
        //     if (c == ' ') {
        //         result.append('-');
        //     } else {
        //         result.append(c);
        //     }
        // }

        // System.out.println("Modified: " + result.toString());

         System.out.println("Original: " + s);
        System.out.println("Modified: " + result);


    }
    
}
