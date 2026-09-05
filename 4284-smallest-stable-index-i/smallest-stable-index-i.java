class Solution {
    public int firstStableIndex(int[] nums, int k) {

        for (int i = 0; i < nums.length; i++) {

            int max = nums[0];

            // Find maximum from 0 to i
            for (int j = 0; j <= i; j++) {
                max = Math.max(max, nums[j]);
            }

            int min = nums[i];

            // Find minimum from i to n-1
            for (int j = i; j < nums.length; j++) {
                min = Math.min(min, nums[j]);
            }

            int score = max - min;

            if (score <= k) {
                return i;
            }
        }

        return -1;
    }
}