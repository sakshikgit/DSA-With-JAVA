package StringInterviewQues;

public class StringLength {
    public static void main(String[] args) {
        String s = "sakshi";

        int count = 0;

        try{
            while (true) {
                s.charAt(count);
                count++;
                
            }
        } catch(Exception e){
            //when index is out of range, stop
        }

        System.out.println(count);
    }
    
}
