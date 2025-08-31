package StringInterviewQues;

public class whiteSpaces {
    public static void main(String[] args){
        String s = " Hello World \n java\tProgramming ";
        String result = s.replaceAll("\\s+", "");

        System.out.println(s);
        System.out.println(result);
    }
    
}
