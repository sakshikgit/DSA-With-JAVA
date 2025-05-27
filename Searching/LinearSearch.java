package Searching;

public class LinearSearch {
    public static void main(String[] args) {

        // int[] arr = {2, 4, 6, 7, 8, 5, 9};
        // int ans = search(arr, 10);
        // System.out.println(ans);


        String name = "Kunal";
        char target = 'u';
        System.out.println(search(name, target));

        
    }

    // searchnin the array: return the index if item found
    // if item not found return -1

    static int search(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
            
        }

        return -1;
    }


    // search in string
    static boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }

        for(int i = 0; i<str.length(); i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
          return false;

    }
    
}
