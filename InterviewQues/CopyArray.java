package InterviewQues;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {

    int[] arr1 = {5, 2, 9, 8, 7};
    int[] arr2 = new int[arr1.length] ; 

        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        System.out.println("Original array: " + Arrays.toString(arr1));
        System.out.println("Copied array: " + Arrays.toString(arr2));

        int[] arr3 = Arrays.copyOf(arr1, arr1.length);

    }
}
    

