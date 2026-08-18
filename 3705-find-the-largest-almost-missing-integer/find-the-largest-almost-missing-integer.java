class Solution {
    public int largestInteger(int[] nums, int k) {

        int n = nums.length;
        int max = -1;

        for (int num : nums) {

            int count = 0;

            // Check every window
            for (int i = 0; i <= n - k; i++) {

                // Check if num is present in this window
                boolean found = false;

                for (int j = i; j < i + k; j++) {
                    if (nums[j] == num) {
                        found = true;
                        break;
                    }
                }

                if (found) {
                    count++;
                }
            }

            // Present in exactly one window
            if (count == 1) {
                max = Math.max(max, num);
            }
        }

        return max;
    }
}