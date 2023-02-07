class Solution {
    public boolean isSubsequence(String s, String t) {
    
        int i=0;
        int j=0;
        int count=0;
       
            while(j<t.length() && i<s.length()){
                
                if(s.charAt(i)!=t.charAt(j)){
                    j++;
                }else if(s.charAt(i)==t.charAt(j)){
                    i++;
                    j++;
                    count++;
                }
            }
        
        if(count == s.length()){
            return true;
        }
        
        return false;
    }
}