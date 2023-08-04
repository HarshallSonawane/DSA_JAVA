class Solution {
    public int totalNQueens(int n) {
        
        char[][] arr = new char[n][n];
        for(int i=0; i<n ; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = '.';
            }
        }
        
        
        boolean[] cols = new boolean[n];
        boolean[] d1 = new boolean[2 * n - 1];
        boolean[] d2 = new boolean[2 * n - 1];
        
        
        return NQueens(arr, 0, cols, d1, d2);
    }
    
    
    public int NQueens(char[][] arr, int row, boolean[] cols, boolean[] d1, boolean[] d2){
        
        
        int count = 0;
        if(row == arr.length){
            return 1;
        }
        
        for(int col = 0; col<arr.length; col++){
            
            if(cols[col] == false && d1[row+col] == false && d2[row-col+arr.length-1] == false){
                arr[row][col] = 'Q';
                cols[col] = true;
                d1[row+col] = true;
                d2[row-col+arr.length-1] = true;
                count+=NQueens(arr,row+1,cols,d1,d2);
                cols[col] = false;
                d1[row+col] = false;
                d2[row-col+arr.length-1] = false;
                arr[row][col] = '.';
            }
        }
        return count;
    }
    
    // public int CountSolution(char[][] arr){
    //     List<String> ans = new ArrayList<>();
    //     for(int i=0;i<arr.length;i++){
    //         String row = new String(arr[i]);
    //         ans.add(row);
    //     }
    //     return ans.size()-1;
    // }
}