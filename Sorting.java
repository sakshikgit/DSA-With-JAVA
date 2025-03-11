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

    // public static void quickSort(int[] arr, int low, int high)
    // {
    //     if(low<high)
    //     {
    //         int pi = partition(arr, low, high);

    //         quickSort(arr, low, pi-1);
    //         quickSort(arr, pi+1, high);
    //     }
    // }

    // private static int partition(int[] arr, int low, int high){
    //     int pivot = arr[high];
    //     int i = low - 1;

    //     for(int j=low; j<high; j++)
    //     {
    //         if(arr[j] < pivot)
    //         {
    //             i++;
    //             int temp = arr[i];
    //             arr[i] = arr[j];
    //             arr[j] = temp;
    //         }

    //     }
    //     int temp = arr[i+1];
    //     arr[i+1] = arr[high];
    //     arr[high] = temp;

    //     return i+1;
    // }

    // public static void main(String[] args){
    //     int arr[] = {5,62,2,3,111,81,4};

    //     quickSort(arr, 0, arr.length-1);


    //     for(int num : arr)
    //     {
    //         System.out.print(num + " ");
    //     }
    //}




    // merge sort starts here 


    private static void mergeSort(int[] arr, int l, int r){

        if(l<r){
            int mid = (l+r)/2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, r);

            merge(arr, l, mid, r);
        }

    }

    private static void merge(int[] arr, int l, int mid, int r){
        int n1 = mid - l + 1;
        int n2 = r - mid;

        int lArr[] = new int[n1];
        int rArr[] = new int[n2];

        for(int x=0; x<n1; x++){
            lArr[x] = arr[l+x];
        }
        for(int x=0; x<n2; x++){
            rArr[x] = arr[mid+1+x];
        }

        int i=0;
        int j=0;
        int k=l;

        while(i<n1 && j<n2){
            if(lArr[i] <= rArr[j]){
                arr[k] = lArr[i];
                i++;
            }
            else{
                arr[k] = rArr[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k] = lArr[i];
            i++;
            k++;
        }

        while(i<n2){
            arr[k] = rArr[i];
            j++;
            k++;
        }

    }

    public static void main(String[] args){
        int arr[] = {3,5,1,4,6,2};

        for(int n : arr){
            System.out.print(n + " ");
        }
        System.out.println();


        mergeSort(arr, 0, arr.length-1);




        System.out.println("After sorting");
        for(int n : arr){
            System.out.print(n + " ");
        }

        
    }
















}
