class Solution {
    public List<List<String>> solveNQueens(int n) {
        
        char[][] arr = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = '.';
            }
        }
        
        List<List<String>> ans = new ArrayList<>();
        nQueen(arr, ans, 0, new boolean[n], new boolean[2 * n - 1], new boolean[2 * n - 1]);
        return ans;
    }
    
    public void nQueen(char[][] arr, List<List<String>> ans, int row, boolean cols[], boolean d1[], boolean d2[]){
        
        if(row == arr.length){
            ans.add(build(arr));
            return;
        }
        
        for(int i=0;i<arr.length;i++){
            
            if(cols[i] == false && d1[i + row] == false && d2[row - i + arr.length - 1] == false){
                arr[row][i] = 'Q';
                cols[i] = true;
                d1[i + row] = true;
                d2[row - i + arr.length - 1] = true;
                nQueen(arr,ans,row+1,cols,d1,d2);
                cols[i] = false;
                d1[i + row] = false;
                d2[row - i + arr.length - 1] = false;
                arr[row][i] = '.';
            }
        }
    }
    
    public List<String> build(char[][] arr){
        
        List<String> smallAns = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            String row = new String(arr[i]);
            smallAns.add(row);
        }
        return smallAns;
    }
    
    public boolean isSafe(char[][] arr,int row,int col){
        
        for(int i=0;i<row;i++){
            if(arr[i][col] == 'Q'){
                return false;
            }
        }
        
        for(int i=row-1,j=col+1;i>=0 && j<arr[0].length;i--,j++){
            if(arr[i][j] == 'Q'){
                return false;
            }
        }
        
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(arr[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
}