class Solution {
    
    int mod=1000000007;
    public int kConcatenationMaxSum(int[] arr, int k) {
     int n=arr.length;
    
    //CASE - I
     if(k==1){
         int result=maxsum(arr);
         return result>0?result:0;
     }
    
    //here we will check both normal sum and kdane sum
     long sum=0;
     for(int i:arr){
         sum+=i;
     }
     // CASE - III
     if(sum<0){
        int result=kadane(arr)%mod;
        return result>0?result:0;
     }
     else{
         //CASE - II 
         int result= (int)(kadane(arr)+((k-2)*sum)%mod)%mod;
         return result>0?result:0;
     }
    }
   
    // simple kadanes algo
    public int maxsum(int []arr){
         int sum=arr[0];
         int result=arr[0];
        for(int i=1;i<arr.length;i++){
            sum=Math.max(sum+arr[i],arr[i]);
            result=Math.max(result,sum);
        }
        return result;
    }
    
    //for k>1 modified kadanes algo (use of modulus)
    public int kadane(int[]arr){
         long sum=arr[0];
         long result=arr[0];
        for(int i=1;i<arr.length*2;i++){
            sum=Math.max(sum+(arr[i%arr.length]%mod),arr[i%arr.length]);
            result=Math.max(result,sum);
        }
        return (int)result;
    }
}