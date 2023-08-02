class Solution {
    public List<List<String>> solveNQueens(int n) {
        
        char[][] arr = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = '.';
            }
        }
        
        List<List<String>> ans = new ArrayList<>();
        nQueen(arr, ans, 0);
        return ans;
    }
    
    public void nQueen(char[][] arr, List<List<String>> ans, int row){
        
        if(row == arr.length){
            ans.add(build(arr));
            return;
        }
        
        for(int i=0;i<arr.length;i++){
            
            if(isSafe(arr,row,i)){
                arr[row][i] = 'Q';
                nQueen(arr,ans,row+1);
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