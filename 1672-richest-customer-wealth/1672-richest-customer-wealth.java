class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int length = accounts.length;
        int sum = 0;
        int maxSum = 0;
        for(int row = 0 ; row < length; row++){
            for(int col = 0; col < accounts[row].length; col++){
                sum += accounts[row][col];
                //System.out.println(sum);
            }
            if(sum>maxSum){
                maxSum = sum;
            }
            sum=0;
        }
        
        return maxSum;
    }
}