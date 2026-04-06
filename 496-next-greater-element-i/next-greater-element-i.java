class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            int idx = -1;

            // find element in nums2
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == nums1[i]) {
                    idx = j;
                    break;
                }
            }

            // find next greater element
            int nge = -1;
            for (int j = idx + 1; j < nums2.length; j++) {
                if (nums2[j] > nums1[i]) {
                    nge = nums2[j];
                    break;
                }
            }

            ans[i] = nge;
        }

        return ans;
    }
}