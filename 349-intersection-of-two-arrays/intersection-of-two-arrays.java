class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set = new HashSet<>();

        // Put nums1 elements into set
        for (int x : nums1) {
            set.add(x);
        }

        ArrayList<Integer> list = new ArrayList<>();

        // Check nums2
        for (int x : nums2) {
            if (set.contains(x)) {
                list.add(x);
                set.remove(x);   // avoid duplicate
            }
        }

        // Convert ArrayList to int[]
        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}