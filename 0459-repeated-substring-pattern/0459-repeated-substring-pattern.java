class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String neww=s+s;
        String con=neww.substring(1,neww.length()-1);
        return con.contains(s);
    }
}