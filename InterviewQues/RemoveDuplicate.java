package InterviewQues;

import java.util.HashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {4,2,4,5,2,3,1};

        HashSet<Integer> set = new HashSet<>();
        for(int num : arr)
        {
            set.add(num);
        }

        System.out.println(set);
    }
    
}
