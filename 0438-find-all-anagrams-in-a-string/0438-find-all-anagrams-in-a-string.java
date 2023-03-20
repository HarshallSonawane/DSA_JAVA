class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> result = new ArrayList<>();
        
        char[] sArr = s.toCharArray();
        char[] pArr = p.toCharArray();
        int[] pCount = new int[26];
        
        for(char pc : pArr)
            pCount[pc-'a']++;

        int l = 0;
        int[] count = new int[26];
        for(int r=0; r<sArr.length; r++) {
            int ind = sArr[r]-'a';
            count[ind]++;
            if(count[ind]>pCount[ind]) {
                while(count[ind]!=pCount[ind]) {
                    count[sArr[l++]-'a']--;
                }
            }
            if(r-l+1 == pArr.length) {
                result.add(l);
            }
        }
        return result;
    }
}