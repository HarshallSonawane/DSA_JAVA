package SearchingAndSorting;

public class BinarySearch {
    
    public static int Binarysearch(int[] arr, int element)
    {
        int start = 0;
        int end = arr.length - 1;
        while(start<=end)
        {
            int mid = (start + end)/2;
            if(element == arr[mid])
            {
                return mid;
            }
            else if(element < arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        
        int arr[] = {2,3,5,6,9,22};
        int found = Binarysearch(arr,5);
        System.out.println(found);
    }
}
