package Recursion.PatterenQues;

public class Triangle {
    public static void main(String[] args){
        triangle(4, 0);

    }

    static void triangle(int r, int c){
        if(r == 0){
            return;
        }
        if(c < r){
            System.out.print("*");
            triangle(r, c+1);
        } else{
            System.out.println();
            triangle(r-1, 0);
        }

    }

    static void bubble(int[] arr, int r, int c){
        if(r == 0){
            return;
        }
        if(c < r){
            if(arr[c] > arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bubble(arr, r, c+1);
        } else{
            bubble(arr, r-1, 0);
        }
    }
    
}
