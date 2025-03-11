public class Sorting{

    // Bubble sort starts here

    // public static void main(String[] args){
    //     int nums[] = {1,5,2,8,9,4};
    //     int size = nums.length;
    //     int temp = 0;

    //     System.out.println("before sorting");
    //     for(int num : nums){
    //         System.out.print(num + " ");
    //     }

    //     for(int i=0;i<size;i++){
    //         for(int j=0;j<size-1;j++){
    //             if(nums[j] > nums[j+1]){
    //                 temp = nums[j];
    //                 nums[j] = nums[j+1];
    //                 nums[j+1] = temp;
                    
    //             }
    //         }
    //     }

    //     System.out.println();
    //     System.out.println("after sorting");
    //     for(int num : nums){
    //         System.out.print(num + " ");
    //     }
    // }


    // selection sort starts here

    //  public static void main(String[] args){
    //     int nums[] = {6,5,2,8,9,4};
    //     int size = nums.length;
    //     int temp = 0;
    //     int minIndex = -1;

    //     System.out.println("before sorting");
    //     for(int num : nums){
    //         System.out.print(num + " ");
    //     }


    //     for(int i=0;i<size-1;i++){
    //         for(int j=i+1;j<size;j++){
    //             if(nums[minIndex] > nums[j]){
    //                 minIndex = j;
    //             }

    //         temp = nums[minIndex];
    //         nums[minIndex] = nums[i];
    //         nums[i] = nums[minIndex];


    //         }
    //     }

    //     System.out.println();
    //     System.out.println("after sorting");
    //     for(int num : nums){
    //         System.out.print(num + " ");
    //     }


    // }



    // selection sort starts here


    // public static void main(String[] args){
    //     int nums[] = {5,6,2,3,1};
    //     int size = nums.length;

    //     for(int i=1;i<size;i++){
    //         int key = nums[i];
    //         int j = i-1;

    //         while(j>=0 && nums[j] > key){
    //             nums[j+1] = nums[j];
    //             j--;
    //         }
    //         nums[j+1] = key;

    //     }

    //     for(int num : nums)
    //     {
    //         System.out.print(num + " ");
    //     }
    // }



    // Quick sort starts here

    public static void quickSort(int[] arr, int low, int high)
    {
        if(low<high)
        {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }

    private static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low - 1;

        for(int j=low; j<high; j++)
        {
            if(arr[j] < pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    public static void main(String[] args){
        int arr[] = {5,6,2,3,1,8,4};

        quickSort(arr, 0, arr.length-1);


        for(int num : arr)
        {
            System.out.print(num + " ");
        }
    }
















}
