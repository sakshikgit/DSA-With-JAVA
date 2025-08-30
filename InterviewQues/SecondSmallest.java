package InterviewQues;

public class SecondSmallest {
    public static void main(String[] args) {
        int[] arr = {1,2,6,5,8,9,4,6,7,3,2,0};
        int smallest = -1;
        int SecondSmallest = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i]<smallest){
                SecondSmallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i] > smallest && arr[i]<SecondSmallest){
                SecondSmallest = arr[i];
            }
        }
        System.out.println(SecondSmallest);
    }
    
}
