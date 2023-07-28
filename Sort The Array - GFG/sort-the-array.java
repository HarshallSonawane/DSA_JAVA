//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 


class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt(); 
            int arr[] = new int[n];
            for (int i = 0; i < n; ++i)
            {
                arr[i] = sc.nextInt();
            }
            Solution obj = new Solution();
            int []ans= obj.sortArr(arr, n);
            for(int i=0;i<n;i++)
            {
                System.out.print(ans[i]+" ");
            }
            System.out.println();
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    int[] sortArr(int[] arr, int n) 
    { 
        MergeSort(arr,0,n-1);
        return arr;
    }
    
    public void MergeSort(int[] arr, int left, int right){
        while(left >= right){ return; }
            
            int mid = left + (right - left)/2;
            MergeSort(arr,left,mid);
            MergeSort(arr,mid+1,right);
            Conquer(arr,left,mid,right);
            
        
    }
    
    public void Conquer(int[] arr, int left, int mid, int right){
        
        int[] ans = new int[right - left + 1];
        
        int idx1 = left;
        int idx2 = mid+1;
        int x = 0;
        while(idx1 <= mid && idx2 <= right){
            if(arr[idx1] <= arr[idx2]){
                ans[x++] = arr[idx1++];
            }else{
                ans[x++] = arr[idx2++];
            }
        }
        
        while(idx1 <= mid){
            ans[x++] = arr[idx1++];
        }
        
        while(idx2 <= right){
            ans[x++] = arr[idx2++];
        }
        
        for(int i=0,j=left;i<ans.length;i++,j++){
            arr[j] = ans[i];
        }
    }
} 