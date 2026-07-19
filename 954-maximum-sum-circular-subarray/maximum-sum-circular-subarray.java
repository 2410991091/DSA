class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        int n = nums.length;

        // Maximum Kadane
        int max = nums[0];
        int sum = 0;
        int total = 0;

        for (int i = 0; i < n; i++) {
            total += nums[i];

            sum += nums[i];
            max = Math.max(max, sum);

            if (sum < 0)
                sum = 0;
        }

        // Minimum Kadane
        int min = nums[0];
        int prevsum = 0;

        for (int i = 0; i < n; i++) {

            prevsum += nums[i];
            min = Math.min(min, prevsum);

            if (prevsum > 0)
                prevsum = 0;
        }

        // All elements are negative
        if (max < 0)
            return max;

        return Math.max(max, total - min);
    }
}