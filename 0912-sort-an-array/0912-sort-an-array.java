class Solution {
    public int[] sortArray(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if (nums == null || nums.length == 0) 
            return nums;
        quickSort(nums, 0, nums.length - 1);
        for (int i=0;i<nums.length;i++) 
            res.add(nums[i]);
        return nums;
    }
    private void quickSort(int[] nums, int l, int r) {
        if (l >= r) 
            return;
        int mid = partition(nums, l, r);
        quickSort(nums, l, mid);
        quickSort(nums, mid + 1, r);
    }
    private int partition(int[] nums, int l, int r) {
        int pivot = nums[l];
        while (l < r) {
            while (l < r && nums[r] >= pivot) r--;
                nums[l] = nums[r];
            while (l < r && nums[l] <= pivot) l++;
                nums[r] = nums[l];
        }
        nums[l] = pivot;
        return l;
    }
}