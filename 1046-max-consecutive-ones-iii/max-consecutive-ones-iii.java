class Solution {
    public int longestOnes(int[] nums, int k) {

        int n = nums.length;
        int left = 0;
        int right = 0;
        int total = 0;
        int track = 0;

        while (right < n) {

            // Agar current element 0 hai
            if (nums[right] == 0) {
                track++;
            }

            // Agar zeros k se zyada ho gaye
            while (track > k) {

                if (nums[left] == 0) {
                    track--;
                }

                left++;
            }

            // Current valid window ki maximum length
            total = Math.max(total, right - left + 1);

            right++;
        }

        return total;
    }
}