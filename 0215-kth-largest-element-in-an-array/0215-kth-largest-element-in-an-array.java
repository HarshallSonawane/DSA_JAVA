class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer> pq= new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i : nums){
            pq.add(i);
        }
        
        System.out.println(pq);
        int ans = 0;
        int i=0;
        while(i!=k-1){
            i++;
            pq.poll();
        }
        return pq.peek();
        // Arrays.sort(nums);
        // return nums[nums.length - k];
    }
}