class Solution {
    public int lengthOfLastWord(String s) {
        
        int count = 0;
        String trim = s.trim();
        char[] chars = trim.toCharArray();
        
        for(int i=chars.length-1;i>=0;i--){
            
            count++;
            if(chars[i] == ' '){
                return count-1;
            }
        }
        return count;
    }
}