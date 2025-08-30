package InterviewQues;

public class Largest3 {
    public static void main(String[] args) {
        int[] arr = {10, 4, 3, 50, 23, 90};

          int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second && num != first) {
                third = second;
                second = num;
            } else if (num > third && num != second && num != first) {
                third = num;
            }
        }

        System.out.println("Largest 3 elements: " + first + ", " + second + ", " + third);
    

    }
    
}
