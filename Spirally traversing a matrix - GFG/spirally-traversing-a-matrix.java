//{ Driver Code Starts
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int m[][], int r, int c)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = m.length;
        int k = m[0].length;
        int rmin = 0;
        int rmax = n - 1;
        int cmin = 0;
        int cmax = k - 1;
        int count = 0;
        
        while(count < n*k){
            
            //top
            for(int i=cmin; i <= cmax && count< n*k; i++){
                ans.add(m[rmin][i]);
                count++;
            }
            rmin++;
            
            //right
            for(int i=rmin;i<=rmax && count<n*k;i++){
                ans.add(m[i][cmax]);
                count++;
            }
            cmax--;
            
            //bottom
            for(int i=cmax;i>=cmin && count<n*k;i--){
                ans.add(m[rmax][i]);
                count++;
            }
            rmax--;
            
            //left
            for(int i=rmax;i>=rmin && count<n*k;i--){
                ans.add(m[i][cmin]);
                count++;
            }cmin++;
        }
        
        return ans;
    }
}
