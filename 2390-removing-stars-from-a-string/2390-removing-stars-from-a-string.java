class Solution {
    public String removeStars(String s) {
        
        Stack<Character> st = new Stack<>();
        
        for( char l : s.toCharArray()){
            
            if(l == '*'){
                st.pop();
            }else{
                st.push(l);
            }
        }
        
        StringBuilder str = new StringBuilder();
        
        for(char c:st){
            str.append(c);
        }
        
        return str.toString();
    }
}