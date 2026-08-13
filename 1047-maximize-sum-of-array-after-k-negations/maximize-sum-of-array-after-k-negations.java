class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {

        Arrays.sort(nums);

        // Flip negative numbers first
        for(int i = 0; i < nums.length && k > 0; i++) {

            if(nums[i] < 0) {
                nums[i] = -nums[i];
                k--;
            }
        }

        // Find smallest value
        int min = nums[0];

        for(int i = 1; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
        }

        // If remaining k is odd,
        // flip the smallest value
        if(k % 2 == 1) {
            min = -min;
        }

        int sum = 0;

        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        if(k % 2 == 1) {
            sum -= 2 * Math.abs(min);
        }

        return sum;
    }
}