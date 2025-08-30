package InterviewQues;

import java.util.Arrays;

public class SeparateEvenOdd {
     public static void main(String[] args) {
        int[] arr = {5, 2, 9, 8, 7, 4, 11};

        // Step 1: Count evens and odds
        int evenCount = 0, oddCount = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Step 2: Create separate arrays
        int[] evenArr = new int[evenCount];
        int[] oddArr = new int[oddCount];

        // Step 3: Fill arrays
        int e = 0, o = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                evenArr[e++] = num;
            } else {
                oddArr[o++] = num;
            }
        }

        // Step 4: Print results
        System.out.println("Even array: " + Arrays.toString(evenArr));
        System.out.println("Odd array: " + Arrays.toString(oddArr));
    }
    
}
