package InterviewQues;

public class SumOfAllElements {
    public static void main(String[] args){
        int[] arr = {2,3,4,5,6,7,8,9,1};
        int res = Sum(arr);
        System.out.println(res);

    }

    static int Sum(int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];

        }
        return sum;
    }
    
    
}
