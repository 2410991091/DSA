class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        long sum = 0;
        long maxsum = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        // First window
        for (int i = 0; i < k; i++) {
            sum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        if (map.size() == k) {
            maxsum = sum;
        }

        int left = 0;
        int right = k;

        while (right < nums.length) {

            // Remove left element
            sum -= nums[left];
            map.put(nums[left], map.get(nums[left]) - 1);

            if (map.get(nums[left]) == 0) {
                map.remove(nums[left]);
            }

            left++;

            // Add right element
            sum += nums[right];
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            right++;

            // Check if all elements are distinct
            if (map.size() == k) {
                maxsum = Math.max(maxsum, sum);
            }
        }

        return maxsum;
    }
}