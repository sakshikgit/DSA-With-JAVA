package StringInterviewQues;

public class RotationCheck {
    public static void main(String[] args) {
        
        String s1 = "ABCD";
        String s2 = "CDAB";

        if(isRotation(s1, s2)){
            System.out.println("Rotation");
        }
        else{
            System.out.println("Not Rotation");
        }
    }

    static boolean isRotation(String s1, String s2){
        if(s1.length() != s2.length()) return false;

        String temp = s1 + s2;

        return temp.contains(s1);
    }
    
}
