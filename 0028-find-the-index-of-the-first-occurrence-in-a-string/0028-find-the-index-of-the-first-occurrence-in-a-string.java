class Solution {
    public int strStr(String haystack, String needle) {
        
        int i=0;
        int j=0;
        int last=0;
        int haystackLength = haystack.length();
        int needleLength = needle.length();
        
        while(i<haystackLength && j<needleLength){
            // System.out.println("i = " + i + " j = " + j);
            if(needle.charAt(j) != haystack.charAt(i)){
                j = 0;
                i = i-last;
                last = 0;
            }else{       
                j++;
                ++last;
                if(j == needleLength){
                    return i-needleLength+1;
                }
            }
            ++i;
        }        
        return -1;
    }
}