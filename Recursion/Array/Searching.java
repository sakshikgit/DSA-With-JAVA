package Recursion.Array;

public class Searching {
    public static void main(String[] args){
        int[] arr = {2, 3, 4, 5, 8};
        System.out.println(searching(arr, 4, 0));
        System.out.println(search(arr, 4, 0));


    }

    static boolean searching(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || searching(arr, target, index+1);
    }

    static int search(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(target == arr[index]){
            return index;
        } else{
           return search(arr, target, index+1);
        }
    }
    
}
