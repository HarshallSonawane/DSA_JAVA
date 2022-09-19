package SearchingAndSorting;



public class MergeSortedArray {
    
    public static int[] MergeArray(int[] a1, int[] a2)
    {
        int i=0;
        int j=0;
        int k=0;
        
        int[] ans = new int[a1.length + a2.length];

        while(i<a1.length && j<a2.length)
        {
            if(a1[i]<a2[j])
            {
                ans[k]=a1[i];
                k++;
                i++;
            }
            else
            {
                ans[k]=a2[j];
                j++;
                k++;
               
            }
        }
        while(i<a1.length)
        {
            ans[k]=a1[i];
            k++;
            i++;
        }
        
        while(j<a2.length)
        {
            ans[k]=a2[j];
            k++;
            j++;
        }
        return ans;
    }
    public static void main(String[] args) {
        
        int a1[] = {1,3,4};
        int a2[] = {2,5};
        int arr[] = MergeArray(a1, a2);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
