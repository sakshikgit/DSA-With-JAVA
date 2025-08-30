package InterviewQues;

public class CountEvenOdd {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 8, 7, 4, 11};

        int evenCount = 0;
        int oddCount = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even elements count: " + evenCount);
        System.out.println("Odd elements count: " + oddCount);
    
}

}
