class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length()){
            return false;
        }
        
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        
        return Arrays.equals(sArray,tArray);
    }
}

/*

Hashtable<Integer, String> sHashtable = new Hashtable<>();
        Hashtable<Integer, String> tHashtable = new Hashtable<>();
        int slength = s.length();
        int tlength = t.length()
        
        for(int i=0;i<slength;i++){
            shashtable.putIfAbsent(i,s.charAt(i));
        }
        
        for(int i=0;i<tlength;i++){
            tHashtable.putIfAbsent(i,s.charAt(i));
        }
*/