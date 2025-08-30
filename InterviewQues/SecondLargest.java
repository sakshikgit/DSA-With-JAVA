package InterviewQues;

public class SecondLargest {
    public static void main(String[] args) {
        
        int[] arr = {2, 5, 4, 3, 2, 6, 7,9,8,10};

        int l = -1;
        int sl = -1;

        for(int i=0; i<arr.length; i++){
            if(arr[i] > l){
                sl = l;
                l = arr[i];
            }
            else if(arr[i] < l && arr[i] > sl){
                sl = arr[i];
            }
        }
        System.out.println(sl);
    }
    
}
