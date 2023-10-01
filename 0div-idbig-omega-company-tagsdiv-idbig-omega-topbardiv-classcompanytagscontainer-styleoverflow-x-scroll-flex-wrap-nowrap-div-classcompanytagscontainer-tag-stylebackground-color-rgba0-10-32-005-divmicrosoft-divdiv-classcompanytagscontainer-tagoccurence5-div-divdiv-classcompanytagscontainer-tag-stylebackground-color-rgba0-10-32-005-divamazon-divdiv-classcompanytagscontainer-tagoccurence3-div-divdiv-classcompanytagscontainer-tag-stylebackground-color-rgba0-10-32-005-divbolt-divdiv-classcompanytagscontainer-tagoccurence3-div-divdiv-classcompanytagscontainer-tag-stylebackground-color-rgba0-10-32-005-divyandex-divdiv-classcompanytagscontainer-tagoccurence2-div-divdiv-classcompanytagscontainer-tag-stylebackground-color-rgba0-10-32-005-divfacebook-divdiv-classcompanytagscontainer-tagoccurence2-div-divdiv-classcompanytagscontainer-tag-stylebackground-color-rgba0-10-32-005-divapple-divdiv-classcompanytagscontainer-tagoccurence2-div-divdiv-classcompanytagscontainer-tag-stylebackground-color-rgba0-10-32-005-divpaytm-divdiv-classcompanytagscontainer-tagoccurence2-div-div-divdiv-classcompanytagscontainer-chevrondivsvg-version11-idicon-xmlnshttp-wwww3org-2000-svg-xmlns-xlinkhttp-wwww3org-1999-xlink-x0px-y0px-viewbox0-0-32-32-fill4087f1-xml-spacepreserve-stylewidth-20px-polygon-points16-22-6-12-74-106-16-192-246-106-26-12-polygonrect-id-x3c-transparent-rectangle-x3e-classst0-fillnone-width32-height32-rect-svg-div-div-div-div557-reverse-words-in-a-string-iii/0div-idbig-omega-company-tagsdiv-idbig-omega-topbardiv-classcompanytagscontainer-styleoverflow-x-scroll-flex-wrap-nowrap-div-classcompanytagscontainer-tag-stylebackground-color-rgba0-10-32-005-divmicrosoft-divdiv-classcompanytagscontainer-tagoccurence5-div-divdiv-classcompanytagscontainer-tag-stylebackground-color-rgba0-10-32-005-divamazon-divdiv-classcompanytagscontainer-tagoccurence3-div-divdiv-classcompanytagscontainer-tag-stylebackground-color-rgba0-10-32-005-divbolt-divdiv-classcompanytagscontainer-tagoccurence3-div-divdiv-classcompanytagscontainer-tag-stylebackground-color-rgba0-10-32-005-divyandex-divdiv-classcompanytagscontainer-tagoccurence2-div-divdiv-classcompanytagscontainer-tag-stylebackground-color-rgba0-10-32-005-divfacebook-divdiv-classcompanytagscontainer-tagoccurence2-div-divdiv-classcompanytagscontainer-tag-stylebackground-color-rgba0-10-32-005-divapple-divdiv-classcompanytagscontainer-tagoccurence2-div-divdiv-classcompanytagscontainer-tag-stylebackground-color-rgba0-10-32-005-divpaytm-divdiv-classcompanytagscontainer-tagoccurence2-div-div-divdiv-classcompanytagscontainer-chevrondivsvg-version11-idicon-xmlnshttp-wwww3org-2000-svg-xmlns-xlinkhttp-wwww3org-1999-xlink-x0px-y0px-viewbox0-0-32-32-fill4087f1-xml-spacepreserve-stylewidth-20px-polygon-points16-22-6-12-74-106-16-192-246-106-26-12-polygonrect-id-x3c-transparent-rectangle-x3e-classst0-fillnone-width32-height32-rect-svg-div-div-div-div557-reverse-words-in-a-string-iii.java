class Solution {
    public String reverseWords(String s) {
        
        StringBuilder ans = new StringBuilder();
        String[] words = s.split(" ");
        for(String word : words){
            StringBuilder str = new StringBuilder(word);
            str.reverse();
            ans.append(str).append(" ");
        }
        
        return ans.toString().trim();
    }
}