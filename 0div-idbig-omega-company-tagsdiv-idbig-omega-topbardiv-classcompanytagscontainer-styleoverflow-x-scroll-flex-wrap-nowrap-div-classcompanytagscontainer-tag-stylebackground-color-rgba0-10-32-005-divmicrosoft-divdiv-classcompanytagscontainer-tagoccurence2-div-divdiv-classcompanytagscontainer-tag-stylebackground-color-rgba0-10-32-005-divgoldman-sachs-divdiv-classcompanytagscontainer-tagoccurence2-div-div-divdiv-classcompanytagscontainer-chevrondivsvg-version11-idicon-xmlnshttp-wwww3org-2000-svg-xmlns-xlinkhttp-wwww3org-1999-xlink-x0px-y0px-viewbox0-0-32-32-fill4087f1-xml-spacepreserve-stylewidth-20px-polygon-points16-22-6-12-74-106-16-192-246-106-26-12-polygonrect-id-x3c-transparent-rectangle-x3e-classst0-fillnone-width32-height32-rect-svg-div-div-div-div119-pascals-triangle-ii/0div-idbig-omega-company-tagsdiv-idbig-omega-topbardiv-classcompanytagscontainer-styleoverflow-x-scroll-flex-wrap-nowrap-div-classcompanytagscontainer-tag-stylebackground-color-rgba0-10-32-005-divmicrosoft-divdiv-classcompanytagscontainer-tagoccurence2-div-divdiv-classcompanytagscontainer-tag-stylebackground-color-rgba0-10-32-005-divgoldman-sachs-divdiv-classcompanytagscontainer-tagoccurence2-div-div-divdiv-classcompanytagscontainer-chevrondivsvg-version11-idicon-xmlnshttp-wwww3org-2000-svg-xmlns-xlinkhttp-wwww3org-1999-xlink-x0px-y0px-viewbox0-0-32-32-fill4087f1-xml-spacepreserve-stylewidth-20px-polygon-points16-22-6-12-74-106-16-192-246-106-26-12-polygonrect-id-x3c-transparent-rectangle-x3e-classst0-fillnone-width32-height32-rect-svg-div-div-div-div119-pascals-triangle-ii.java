class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        List<Integer> answer = new ArrayList<>();
        
        answer.add(1);
        if(rowIndex == 0){
            return answer;
        }
        
        long ans = 1;
        for(int i=0;i<rowIndex;i++){

            ans = ans*(rowIndex - (i));
            ans = ans/(i+1);
            answer.add((int)ans);
        }
        return answer;
    }
}