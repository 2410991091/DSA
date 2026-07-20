class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        int n = nums.length;

        int max = nums[0];
        int sum = 0;
        int total = 0;

        // Maximum Kadane
        for (int i = 0; i < n; i++) {

            total += nums[i];

            sum += nums[i];
            max = Math.max(max, sum);

            if (sum < 0)
                sum = 0;
        }

        // Minimum Kadane
        int minsum = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            minsum += nums[i];
            min = Math.min(min, minsum);

            if (minsum > 0)      // <-- opposite condition
                minsum = 0;
        }

        if (max < 0)
            return max;

        return Math.max(max, total - min);
    }
}