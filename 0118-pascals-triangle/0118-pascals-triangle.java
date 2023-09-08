class Solution {


    public List<Integer> pascalRow(int row){

        List<Integer> rowAns = new ArrayList<>();
        rowAns.add(1);
        int ans = 1;

        for(int col=1;col<row;col++){
            ans = ans*(row-col);
            ans = ans/(col);
            rowAns.add(ans);
        }
        return rowAns;
    }

    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            ans.add(pascalRow(i));
        }
        return ans;
    }
}