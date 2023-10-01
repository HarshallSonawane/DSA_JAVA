class Solution {
    public String reverseWords(String s) {
        
        String ans = "";
        String[] words = s.split(" ");
        for(String str : words){
            for(int i=str.length()-1;i>=0;i--){
                ans+=str.charAt(i);
            }
            ans+=" ";
            // ans+=helper(str);    
        }
        return ans.stripTrailing();
        
    }
    
//     public String helper(String str){
        
//         String smallAns = "";
//         for(int i=str.length()-1;i>=0;i--){
//             smallAns+=str.charAt(i);
//         }
//         System.out.println(smallAns);
//         return str;
//     }
}