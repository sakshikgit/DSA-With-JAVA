package InterviewQues;

public class countGreater {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 1, 10};
        int x = 5;

        int count = 0;
        for (int num : arr) {
            if (num > x) {
                count++;
            }
        }

        System.out.println("Count of elements greater than " + x + " = " + count);
    }
    
}
