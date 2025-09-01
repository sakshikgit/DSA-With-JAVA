package StringInterviewQues;

public class OnlyDigits {
    public static void main(String[] args) {
        
        String s = "12345875";

        boolean onlyDigits = true;

        for(int i=0; i<s.length(); i++){
            if(!Character.isDigit(s.charAt(i)))
            {
                onlyDigits = false;
                break;
            }
        }

         if (onlyDigits)
            System.out.println("String contains only digits.");
        else
            System.out.println("String does not contain only digits.");


    }

    static void OnlyDigits2(String s){
        s = "987654";

        if (s.matches("\\d+")) {   // \\d means digit, + means one or more
            System.out.println("String contains only digits.");
        } else {
            System.out.println("String does not contain only digits.");
        }

    }
    
}
