package InterviewQues;

public class FirstLastOccurance {
    public static void main(String[] args) {

        int[] arr = {10, 20, 20, 20, 20, 50};
        int target = 20;

        int index = -1;

        int first = 0;
        int last = arr.length - 1;

        while(first <= last){
            int mid = first + (last - first)/2;

            if(arr[mid] == target)
            {
                index = mid;
                last = mid - 1; // for first occurance 
                //first = mid + 1 - for last occurance
                // for total occurance last - first + 1;

            }

            else if(arr[mid] > target)
            {
                last = mid - 1;
            }

            else
            {
                first = mid + 1;
            }
          
        }

        System.out.println(index);
        

    }
    
}
