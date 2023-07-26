class Solution {
    public int findDuplicate(int[] arr) {
        
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<arr.length;i++){    
            if(mp.containsKey(arr[i])){
                mp.put(arr[i], mp.get(arr[i])+1);
            }else{
                mp.put(arr[i],1);
            }
        }
        
        Iterator hmIterator = mp.entrySet().iterator();
        
        while (hmIterator.hasNext()){
            
            Map.Entry mapElement = (Map.Entry)hmIterator.next();
            if((int)(mapElement.getValue()) > 1){
                return (int)mapElement.getKey();
            }
        }
        
        return -1;
    }
}