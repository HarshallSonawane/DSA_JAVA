//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine();
            String[] S = s.split(" ");
            int[] v = new int[2 * n + 2];
            for(int i = 0; i < 2 * n + 2; i++)
            {
                v[i] = Integer.parseInt(S[i]);
            }
            Solution ob = new Solution();
            int[] ans = ob.singleNumber(v);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int[] singleNumber(int[] arr)
    {
        int[] ans = new int[2];
       HashMap<Integer,Integer> mp = new HashMap<>();
       for(int i=0;i<arr.length;i++){
           if(mp.containsKey(arr[i])){
               mp.put(arr[i], mp.get(arr[i])+1);
           }else{
               mp.put(arr[i], 1);
           }
       }
       
       int j=0;
       for(Map.Entry<Integer,Integer> e: mp.entrySet()) {
           if(e.getValue() == 1){
               ans[j] = (int)e.getKey();
               j++;
           }
       }
       if(ans[0] > ans[1]){
           int temp = ans[0];
           ans[0] = ans[1];
           ans[1] = temp;
       }
       return ans;
    }
}