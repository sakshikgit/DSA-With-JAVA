package InterviewQues;

public class CheckSorted {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};  
        

        boolean isSorted = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }

        System.out.println("Array sorted? " + isSorted);
    }
    
}
