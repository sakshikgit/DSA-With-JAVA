package InterviewQues;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int s = 0;
        int e = arr.length - 1;

        while(s < e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;

            s++;
            e--;
        }

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
    
}
