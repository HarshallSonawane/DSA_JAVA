class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder st=new StringBuilder();
        while(columnNumber>0){
            columnNumber--;
            //get ASCII of given digit
            char digit=(char)('A'+(columnNumber%26));
            st.append(digit);
            columnNumber/=26;   //shift from units place to tens place
        }
        return st.reverse().toString();
    }
}