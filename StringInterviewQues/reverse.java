package StringInterviewQues;

public class reverse {
    public static void main(String[] args){

        String s = "jfnvfjnfjvnfjn";

        char[] arr = s.toCharArray();

        int n = arr.length;

        for(int i=0; i<n/2; i++){
            char temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }

        String reversed = new String(arr);

        System.out.println(reversed);

       
    }
}
