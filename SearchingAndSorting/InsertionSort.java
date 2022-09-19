package SearchingAndSorting;

public class InsertionSort {
    
    public static void Insertionsort(int[] arr)
    {

        for(int i = 1; i < arr.length; i++)
        {
            int key = arr[i];
            int j = i - 1;
            while(j>=0 && arr[j]> key)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }

    public static void main(String[] args) {
        
        int[] arr={4,6,7,23,1,8,2,3};
        Insertionsort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
