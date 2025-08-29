package InterviewQues;

public class Average {
    public static void main(String[] args){
        int[] arr = {2,4,6};
        double res = Average(arr);
        System.out.println(res);
    }

    static double Average(int[] nums){
        int sum = 0;
        int n = nums.length;

        for(int i=0; i<n; i++){
            sum += nums[i];

        }
        double average = sum/n;
        return average;


    }

    
}
