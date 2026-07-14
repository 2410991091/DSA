class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int left = 0;
        int right = 0;
        int zerocount = 0;
        int max = 0;

        while (right < n) {

            // Current element enters the window
            if (nums[right] == 0)
                zerocount++;

            // Shrink window until it becomes valid
            while (zerocount > k) {
                if (nums[left] == 0)
                    zerocount--;
                left++;
            }

            // Update answer
            max = Math.max(max, right - left + 1);

            // Expand window
            right++;
        }

        return max;
    }
}