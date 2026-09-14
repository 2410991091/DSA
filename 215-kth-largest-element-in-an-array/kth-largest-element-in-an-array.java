class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
    int f=nums.length-k;
    return nums[f];
        
    }
}